package todo.pjt.back.schedule.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_todo_content")
public class TodoContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_content_id")
    private int todoContentId;

    @Column(name = "todo_content")
    private String todoContent;

    @Column(name = "completeYn")
    private String completeYn;

    @ManyToOne
    @JoinColumn(name = "todo_id")
    private Todo todo;
}
