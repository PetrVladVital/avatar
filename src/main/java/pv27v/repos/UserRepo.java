package pv27v.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import pv27v.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
