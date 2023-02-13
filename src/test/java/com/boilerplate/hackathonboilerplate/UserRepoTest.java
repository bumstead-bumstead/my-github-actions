package com.boilerplate.hackathonboilerplate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.boilerplate.hackathonboilerplate.domain.User;
import com.boilerplate.hackathonboilerplate.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class UserRepoTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void adduser(){
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("yohwan" + i);
            user.setBirth(LocalDate.now());
            user.setCreatedDate(LocalDateTime.now());
            user.setPassword(i+"");

            userRepository.save(user);
        }
    }

    @Test
    void findTest() {
        List<User> list = userRepository.findByPassword("0");

        for (User user : list) {
            System.out.println(user.getId());
        }

    }

    @Test
    void betweenTest() {
        List<User> list = userRepository.findByIdBetween(5, 15);
        for (int i = 0; i < list.size(); i++) {
            assertTrue(list.get(i).getId() == 5 + i);
        }
    }
}
