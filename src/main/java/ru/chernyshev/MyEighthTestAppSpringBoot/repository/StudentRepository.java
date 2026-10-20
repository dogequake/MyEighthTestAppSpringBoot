package ru.chernyshev.MyEighthTestAppSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chernyshev.MyEighthTestAppSpringBoot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
