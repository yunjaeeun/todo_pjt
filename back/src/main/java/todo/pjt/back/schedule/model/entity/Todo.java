package todo.pjt.back.schedule.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id")
    private int todoId;

    @Column(name = "todo_title")
    private String todoTitle;

    @Column(name = "completeYn")
    private String comepleteYn;

    @Column(name = "startDate")
    private String startDate;

    @Column(name = "endDate")
    private String endDate;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

}
