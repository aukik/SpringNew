package com.springtest.springnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringNewApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(SpringNewApplication.class, args);
        Person p=context.getBean(Person.class);//object will be created when get bean is called in scope isn't used
        Person p1=context.getBean(Person.class);
        p1.show();
        p.show();
        System.out.println("end");
    }

}
