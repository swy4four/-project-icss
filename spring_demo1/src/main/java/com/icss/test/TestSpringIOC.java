package com.icss.test;

import com.icss.bean.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIOC {
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = (Employee) ac.getBean("e1");
        System.out.println(employee);
    }
    @Test
    public void test2(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
        Employee employee=(Employee) ac.getBean("e2");
        System.out.println(employee);
    }
    @Test
    public void test3(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
        Employee employee=(Employee) ac.getBean("e3");
        System.out.println(employee);
    }

}
