package todo.pjt.back.user.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import todo.pjt.back.user.repo.UserRepository;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
}
