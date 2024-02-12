package DesignPatterns.Builder.StudentBuilder;

import java.util.List;

public abstract class StudentBuilder {
    String firstName;
    String lastName;
    int age;
    int rollNo;
    List<String> subjects;

    StudentBuilder setFirstName(String name){
        this.firstName = name;
        return this;
    }

    StudentBuilder setLastName(String name){
        this.lastName = name;
        return this;
    }

    StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    StudentBuilder setFRollNo(int rollNo){
        this.rollNo = rollNo;
        return this;
    }

    abstract public StudentBuilder setSubjects(List<String> subjects);

    public Student build(){
        return new Student(this);
    }
}
