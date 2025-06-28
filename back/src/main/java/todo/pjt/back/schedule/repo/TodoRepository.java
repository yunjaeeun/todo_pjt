package todo.pjt.back.schedule.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.pjt.back.schedule.model.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
