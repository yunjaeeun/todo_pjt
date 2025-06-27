package todo.pjt.back.memo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import todo.pjt.back.memo.repo.MemoFileRepository;
import todo.pjt.back.memo.repo.MemoRepository;

@Service
@AllArgsConstructor
public class MemoServiceImpl implements MemoService{
    private final MemoRepository memoRepository;
    private final MemoFileRepository memoFileRepository;
}
