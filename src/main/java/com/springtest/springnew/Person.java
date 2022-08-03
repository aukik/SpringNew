package com.springtest.springnew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype") //won't remain singleton if it is used (object will be created before calling getbeans)
public class Person {
    private int age;
    private String name;
    @Autowired //making object without using getbeans in this laptop instance. autowired searches by type (Device).
    @Qualifier("phn1")//selects phone from laptop and phone because Device interface is implemented by both.qualifier searches by name (phn1).
    private Device device;

    public Person() {
        System.out.println("object created!!!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public void show(){
        System.out.println("in show");
        device.compiled();
    }

}
