package org.jayden;

import org.jayden.bean.User;
import org.jayden.mapper.UserMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    @DisplayName("findAll")
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users.toString());
    }
    @Test
    @DisplayName("insertUser")
    public void insertUser(){
        User user = new User();
        user.setAge(30);
        user.setEmail("lucy@qq.com");
        user.setName("lucy");
        int returnValue = userMapper.insert(user);
        System.out.println(returnValue);
    }
    @Test
    @DisplayName("AlterById")
    void alterById(){
        User user = new User();
        user.setId(2L);
        user.setName("jayden");
        int row = userMapper.updateById(user);
        System.out.println(row);
    }

}
