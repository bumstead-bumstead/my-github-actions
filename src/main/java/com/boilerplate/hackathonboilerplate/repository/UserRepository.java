package com.boilerplate.hackathonboilerplate.repository;


import com.boilerplate.hackathonboilerplate.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findByPassword(String password);

    public List<User> findByIdBetween(Integer fromId, Integer toId);
}
