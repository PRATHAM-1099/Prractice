package DesignPatterns.Builder.StudentBuilder;

import java.util.Arrays;

public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student getStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return new EngineeringStudentBuilder().setFirstName("prat").setLastName("chris").setAge(23).setFRollNo(12).setSubjects(Arrays.asList("DSA", "Java")).build();
        }
        else {
            return new MedicalStudentBuilder().setFirstName("prat").setLastName("chris").setAge(23).setFRollNo(12).setSubjects(Arrays.asList("Biology", "Botany")).build();
        }
    }

}
