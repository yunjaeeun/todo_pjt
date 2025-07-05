package todo.pjt.back.schedule.model.response;

import lombok.Builder;
import lombok.Data;
import todo.pjt.back.schedule.model.entity.ScheduleCategory;

import java.util.List;

@Data
@Builder
public class ResFindScheduleCategoryList {
    List<ScheduleCategory> scheduleCategoryList;
}
