package com.example.mybatisplusdemo.sample;

import com.example.mybatisplusdemo.mapper.User;
import com.example.mybatisplusdemo.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        Assertions.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
        String name = userMapper.getNameById("1");
        System.out.println(name);

    }

}
