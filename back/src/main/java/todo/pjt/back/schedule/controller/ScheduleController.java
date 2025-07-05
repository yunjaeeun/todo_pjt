package todo.pjt.back.schedule.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todo.pjt.back.schedule.model.request.ReqCraeteTodo;
import todo.pjt.back.schedule.model.request.ReqCreateSchedule;
import todo.pjt.back.schedule.model.request.ReqCreateScheduleCategory;
import todo.pjt.back.schedule.model.response.*;
import todo.pjt.back.schedule.service.ScheduleService;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
@AllArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("/category")
    public ResponseEntity<ResCreateScheduleCategory> craeteScheduleCategory(
            @RequestBody ReqCreateScheduleCategory req
    ) {
        ResCreateScheduleCategory res = scheduleService.createScheduleCategory(req);

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping("/category")
    public ResponseEntity<ResFindScheduleCategoryList> findScheduleCategoryList() {
        ResFindScheduleCategoryList res = scheduleService.findScheduleCategoryList();

        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity<ResCreateSchedule> createSchedule(
            @RequestBody ReqCreateSchedule req
    ) {
        ResCreateSchedule res = scheduleService.createSchedule(req);

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping
    public ResponseEntity<List<ResFindScheduleList>> findScheduleList() {
        List<ResFindScheduleList> res = scheduleService.findScheduleList();

        return ResponseEntity.ok(res);
    }

    @GetMapping("/{scheduleId}")
    public ResponseEntity<ResFindSchedule> findSchedule(
            @PathVariable int scheduleId
    ) {
        ResFindSchedule res = scheduleService.findSchedule(scheduleId);

        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{scheduleId}")
    public ResponseEntity<String> deleteSchedule(
            @PathVariable int scheduleId
    ) {
        String res = scheduleService.deleteSchedule(scheduleId);

        return ResponseEntity.ok(res);
    }

    @PostMapping("/todo")
    public ResponseEntity<ResCreateTodo> createTodo(
            @RequestBody ReqCraeteTodo req
    ) {

        ResCreateTodo res = scheduleService.createTodo(req);

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping("/todo")
    public ResponseEntity<ResFindTodo> findTodoList() {
        ResFindTodo res = scheduleService.findTodo();

        return ResponseEntity.ok(res);
    }

}
