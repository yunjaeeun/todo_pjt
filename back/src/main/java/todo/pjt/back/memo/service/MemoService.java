package todo.pjt.back.memo.service;

import todo.pjt.back.memo.model.request.ReqCreateMemo;
import todo.pjt.back.memo.model.response.ResCreateMemo;
import todo.pjt.back.memo.model.response.ResFindMemo;
import todo.pjt.back.memo.model.response.ResFindMemoList;

import java.util.List;

public interface MemoService {
    ResCreateMemo createMemo(ReqCreateMemo req);

    ResFindMemo findMemo(int memoId);

    List<ResFindMemoList> findMemoList();

    String deleteMemo(int memoId);
}
