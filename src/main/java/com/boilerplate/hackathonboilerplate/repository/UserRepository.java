package com.boilerplate.hackathonboilerplate.repository;


import com.boilerplate.hackathonboilerplate.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
