package todo.pjt.back.memo.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResFindMemoList {
    private int memoId;
    private String memoContent;
    private String memoDate;
}
