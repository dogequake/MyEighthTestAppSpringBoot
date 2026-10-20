package ru.chernyshev.MyEighthTestAppSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chernyshev.MyEighthTestAppSpringBoot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
