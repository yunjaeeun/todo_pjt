package todo.pjt.back.schedule.model.entity;

import jakarta.persistence.*;
import todo.pjt.back.user.model.entity.User;

@Entity
@Table(name = "tbl_schedule_category")
public class ScheduleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_category_id")
    private int scheduleCategoryId;

    @Column(name = "schedule_category")
    private String scheduleCategory;

    @Column(name = "schedule_category_color")
    private String scheduleCategoryColor;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
