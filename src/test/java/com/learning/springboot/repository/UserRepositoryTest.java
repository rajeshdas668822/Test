package com.learning.springboot.repository;

import com.learning.springboot.config.JpaConfig;
import com.learning.springboot.data.User;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes={JpaConfig.class})
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp(){
       /* User user = new User();
        user.setName("Admin");
        user.setEmail("admin@gmail.com");
        userRepository.save(user);*/
    }


    @Test
    public void testUserCreation(){
        User user = userRepository.findUserByName("Admin");
        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getId());
       // Assert.assertThat("Admin",user.getName().equals("Admin"));

    }

}
