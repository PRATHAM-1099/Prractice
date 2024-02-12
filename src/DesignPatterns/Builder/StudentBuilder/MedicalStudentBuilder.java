package DesignPatterns.Builder.StudentBuilder;

import java.util.List;

public class MedicalStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = subjects;
        return this;
    }
}
