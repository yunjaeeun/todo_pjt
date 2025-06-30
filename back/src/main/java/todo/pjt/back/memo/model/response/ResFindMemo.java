package todo.pjt.back.memo.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import todo.pjt.back.memo.model.entity.Memo;
import todo.pjt.back.memo.model.entity.MemoFile;

import java.util.List;

@Data
@Builder
public class ResFindMemo {
    private Memo memo;
    private List<MemoFile> memoFile;
}
