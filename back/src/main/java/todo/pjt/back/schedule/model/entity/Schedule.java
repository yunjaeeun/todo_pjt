package todo.pjt.back.schedule.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private int scheduleId;

    @Column(name = "schedule_year")
    private String scheduleYear;

    @Column(name = "schedule_month")
    private String scheduleMonth;

    @Column(name = "schedule_date")
    private String scheduleDate;

    @Column(name = "repeat_period")
    private int repeatPeriod;

    @ManyToOne
    @JoinColumn(name = "schedule_category_id")
    private ScheduleCategory scheduleCategory;
}
