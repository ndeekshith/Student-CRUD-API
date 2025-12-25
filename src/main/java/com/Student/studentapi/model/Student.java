package com.Student.studentapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private int age;

    public Student() {}

    public Student(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;

    }
    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
