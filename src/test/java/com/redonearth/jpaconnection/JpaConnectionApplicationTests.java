package com.redonearth.jpaconnection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaConnectionApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void insertUser() {
        User user = new User();
        user.setUserID("test");
        user.setUserPassword("111111");
        user.setUserEmail("test@test.com");
        userRepository.save(user);
    }

}
