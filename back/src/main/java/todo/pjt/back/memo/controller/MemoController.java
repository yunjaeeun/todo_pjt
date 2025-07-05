package todo.pjt.back.memo.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todo.pjt.back.memo.model.request.ReqCreateMemo;
import todo.pjt.back.memo.model.response.ResCreateMemo;
import todo.pjt.back.memo.model.response.ResFindMemo;
import todo.pjt.back.memo.model.response.ResFindMemoList;
import todo.pjt.back.memo.service.MemoService;

import java.util.List;

@RestController
@RequestMapping("/api/memo")
@AllArgsConstructor
public class MemoController {
    private final MemoService memoService;


    @PostMapping
    public ResponseEntity<ResCreateMemo> craeteMemo(
            @RequestBody ReqCreateMemo req
            ) {
        ResCreateMemo res = memoService.createMemo(req);
        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping("/{memoId}")
    public ResponseEntity<ResFindMemo> findMemo(
            @PathVariable int memoId
    ) {
        ResFindMemo res = memoService.findMemo(memoId);

        return ResponseEntity.ok(res);
    }

    @GetMapping
    public ResponseEntity<List<ResFindMemoList>> findMemoList() {
        List<ResFindMemoList> res = memoService.findMemoList();

        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{memoId}")
    public ResponseEntity<String> deleteMemo(
            @PathVariable int memoId
    ) {
        String message = memoService.deleteMemo(memoId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(message);
    }

}
