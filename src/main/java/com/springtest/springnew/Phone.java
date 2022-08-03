package com.springtest.springnew;

import org.springframework.stereotype.Component;

@Component("phn1")//custom name for this component. name is used in qualifier. 
public class Phone implements Device {
    private int id;
    private String name;
    public Phone() {
        System.out.println("This is phone");
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
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void compiled(){
        System.out.println("phone compiled");
    }
}
