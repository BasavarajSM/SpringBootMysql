package com.mindtree.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
