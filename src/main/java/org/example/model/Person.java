package org.example.model;

public class Person
{
    private String name;
    private int age;
    private int pid;
    private static int personId = 1;

    public Person(){pid=personId++;}

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return pid;
    }



}
