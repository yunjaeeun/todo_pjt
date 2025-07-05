package todo.pjt.back.schedule.service;

import todo.pjt.back.schedule.model.request.ReqCraeteTodo;
import todo.pjt.back.schedule.model.request.ReqCreateSchedule;
import todo.pjt.back.schedule.model.request.ReqCreateScheduleCategory;
import todo.pjt.back.schedule.model.response.*;

import java.util.List;

public interface ScheduleService {
    ResCreateScheduleCategory createScheduleCategory(ReqCreateScheduleCategory req);
    ResCreateTodo createTodo(ReqCraeteTodo req);

    ResFindTodo findTodo();

    ResFindScheduleCategoryList findScheduleCategoryList();

    ResCreateSchedule createSchedule(ReqCreateSchedule req);

    List<ResFindScheduleList> findScheduleList();

    ResFindSchedule findSchedule(int scheduleId);

    String deleteSchedule(int scheduleId);
}
