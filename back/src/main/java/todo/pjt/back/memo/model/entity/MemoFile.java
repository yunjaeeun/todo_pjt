package todo.pjt.back.memo.model.entity;

import jakarta.persistence.*;

@Table(name = "tbl_memo_file")
@Entity
public class MemoFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memo_file_id")
    private int memoFileId;

    @Column(name = "memo_file_url")
    private String memoFileUrl;

    @Column(name = "memo_file_name")
    private String memoFileName;

    @Column(name = "memo_file_create_date")
    private String memoFileCreateDate;

    @ManyToOne
    @JoinColumn(name = "memo_id")
    private Memo memo;
}
