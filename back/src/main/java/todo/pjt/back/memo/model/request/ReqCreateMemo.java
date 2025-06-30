package todo.pjt.back.memo.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReqCreateMemo {
    private String memoContent;
    private int userId;
}
