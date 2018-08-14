package com.example.dockerfiledemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DockerfiledemoApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {

    }

    @Test
    public void updateTest(){
        int result=0;
        String sql="update student set name=? where id=?";
        Object[] params = new Object[]{"aaaaa",2};//设置参数
        result=jdbcTemplate.update(sql,params);//返回受影响的行数
        System.out.println(result);
    }
}
