package DesignPatterns.Builder.StudentBuilder;

public class Client {
    public static void main(String[] args) {

        MedicalStudentBuilder medicalStudentBuilder = new MedicalStudentBuilder();
        Director director = new Director(medicalStudentBuilder);
        System.out.println(director.getStudent());
    }
}
