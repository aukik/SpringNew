package com.springtest.springnew;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary //creates object of this class in person where object of Device interface is to be created
@Component
public class Laptop implements Device  {
    private int id;
    private String name;

    public Laptop() {
        System.out.println("Laptop created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void compiled(){
        System.out.println("laptop compiled");
    }
}
