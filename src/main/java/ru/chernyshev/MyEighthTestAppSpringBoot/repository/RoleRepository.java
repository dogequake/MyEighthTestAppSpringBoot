package ru.chernyshev.MyEighthTestAppSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chernyshev.MyEighthTestAppSpringBoot.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
