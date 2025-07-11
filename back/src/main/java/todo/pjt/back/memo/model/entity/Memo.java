package todo.pjt.back.memo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import todo.pjt.back.user.model.entity.User;

@Entity
@Table(name = "tbl_memo")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memo_id")
    private int memoId;

    @Column(name = "memo_content")
    private String memoContent;

    @Column(name = "memo_date")
    private String memoDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
