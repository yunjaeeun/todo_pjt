package todo.pjt.back.memo.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import todo.pjt.back.memo.model.entity.Memo;
import todo.pjt.back.memo.model.entity.MemoFile;
import todo.pjt.back.memo.model.request.ReqCreateMemo;
import todo.pjt.back.memo.model.response.ResCreateMemo;
import todo.pjt.back.memo.model.response.ResFindMemo;
import todo.pjt.back.memo.model.response.ResFindMemoList;
import todo.pjt.back.memo.repo.MemoFileRepository;
import todo.pjt.back.memo.repo.MemoRepository;
import todo.pjt.back.user.model.entity.User;
import todo.pjt.back.user.repo.UserRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MemoServiceImpl implements MemoService{
    private final MemoRepository memoRepository;
    private final MemoFileRepository memoFileRepository;
    private final UserRepository userRepository;
    private final ModelMapper mapper;

    @Override
    public ResCreateMemo createMemo(ReqCreateMemo req) {
        User user = userRepository.findById(req.getUserId())
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 회원"));

        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        Memo memo = Memo.builder()
                .memoContent(req.getMemoContent())
                .user(user)
                .memoDate(formattedDate)
                .build();


        Memo saveMemo = memoRepository.save(memo);

        /* 파일 등록 로직 추가 */

        ResCreateMemo res = ResCreateMemo.builder()
                .memoId(saveMemo.getMemoId())
                .build();
        return res;
    }

    @Override
    public ResFindMemo findMemo(int memoId) {
        Memo memo = memoRepository.findById(memoId)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 메모"));

        List<MemoFile> memoFileList = memoFileRepository.findAllByMemoMemoId(memoId);

        ResFindMemo res = ResFindMemo.builder()
                .memo(memo)
                .memoFile(memoFileList)
                .build();
        return res;
    }

    @Override
    public List<ResFindMemoList> findMemoList() {
        int userId = 1;
        List<Memo> memoList = memoRepository.findAllByUserUserId(userId);

        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<ResFindMemoList> res = memoList.stream().map(memo -> mapper
                .map(memo, ResFindMemoList.class))
                .collect(Collectors.toList());

        return res;
    }

    @Override
    public String deleteMemo(int memoId) {

        try {
            memoRepository.deleteById(memoId);

            /* 파일 삭제 로직 추가 */
            memoFileRepository.deleteAllByMemoMemoId(memoId);
            return "삭제 성공";
        } catch (Exception e) {
            return "삭제 실패";
        }
    }
}
