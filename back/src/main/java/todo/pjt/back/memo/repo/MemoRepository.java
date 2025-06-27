package todo.pjt.back.memo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.pjt.back.memo.model.entity.Memo;

@Repository
public interface MemoRepository extends JpaRepository<Memo, Integer> {
}
