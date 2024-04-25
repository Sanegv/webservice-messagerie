package com.ynov.messagerie.repos;

import com.ynov.messagerie.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User save(User user);
}
