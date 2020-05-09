package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zlx.mapper.UserMapper;

public class Test {
    @org.junit.Test
    public void fun(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserMapper userMapper = ac.getBean(UserMapper.class);
        Integer c=userMapper.countUserByUserName("zlx");
        System.out.println(c);
    }
}
