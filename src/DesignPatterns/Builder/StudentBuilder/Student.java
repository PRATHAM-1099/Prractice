package DesignPatterns.Builder.StudentBuilder;

import java.util.List;

public class Student {
    String firstName;
    String lastName;
    int age;
    int rollNo;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                ", subjects=" + subjects +
                '}';
    }

    List<String> subjects;

    Student(StudentBuilder studentBuilder){
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.age = studentBuilder.age;
        this.rollNo = studentBuilder.rollNo;
        this.subjects = studentBuilder.subjects;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }



}
