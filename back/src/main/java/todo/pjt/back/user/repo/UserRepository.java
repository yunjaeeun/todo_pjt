package todo.pjt.back.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.pjt.back.user.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
