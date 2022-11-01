package xyz.brunocabete.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.brunocabete.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
