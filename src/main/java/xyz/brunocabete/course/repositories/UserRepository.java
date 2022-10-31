package xyz.brunocabete.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.brunocabete.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
