package todo.pjt.back.memo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import todo.pjt.back.memo.service.MemoService;

@RestController
@RequestMapping("/api/memo")
@AllArgsConstructor
public class MemoController {
    private final MemoService memoService;
}
