package todo.pjt.back.schedule.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.pjt.back.schedule.model.entity.TodoContent;

@Repository
public interface TodoContentRepository extends JpaRepository<TodoContent, Integer> {
}
