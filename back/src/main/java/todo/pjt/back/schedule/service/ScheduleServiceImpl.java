package todo.pjt.back.schedule.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import todo.pjt.back.schedule.model.request.ReqCraeteTodo;
import todo.pjt.back.schedule.model.request.ReqCreateSchedule;
import todo.pjt.back.schedule.model.request.ReqCreateScheduleCategory;
import todo.pjt.back.schedule.model.response.*;
import todo.pjt.back.schedule.repo.ScheduleCategoryRepository;
import todo.pjt.back.schedule.repo.ScheduleRepository;
import todo.pjt.back.schedule.repo.TodoContentRepository;
import todo.pjt.back.schedule.repo.TodoRepository;
import todo.pjt.back.user.repo.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {
    ScheduleCategoryRepository scheduleCategoryRepository;
    ScheduleRepository scheduleRepository;
    TodoContentRepository todoContentRepository;
    TodoRepository todoRepository;
    UserRepository userRepository;

    @Override
    public ResCreateScheduleCategory createScheduleCategory(ReqCreateScheduleCategory req) {
        return null;
    }

    @Override
    public ResCreateTodo createTodo(ReqCraeteTodo req) {
        return null;
    }

    @Override
    public ResFindTodo findTodo() {
        return null;
    }

    @Override
    public ResFindScheduleCategoryList findScheduleCategoryList() {
        return null;
    }

    @Override
    public ResCreateSchedule createSchedule(ReqCreateSchedule req) {
        return null;
    }

    @Override
    public List<ResFindScheduleList> findScheduleList() {
        return null;
    }

    @Override
    public ResFindSchedule findSchedule(int scheduleId) {
        return null;
    }

    @Override
    public String deleteSchedule(int scheduleId) {
        return null;
    }
}
