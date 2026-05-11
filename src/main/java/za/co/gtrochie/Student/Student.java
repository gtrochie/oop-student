package za.co.gtrochie.Student;

public class Student {
    private String name;
    private int studentNumber;

    public Student(String name){
        if (name == null){
            throw new NullPointerException("name may not be null");
        }
        if (name.isEmpty()){
            throw new IllegalArgumentException("name may not be empty");
        }
        this.name = name;
    }

    public Student(String name, int studentNumber){
        this.name = name;
        if (studentNumber <= 0){
            throw new IllegalArgumentException("student number must be a positive integer")
        }
        this.studentNumber = studentNumber;
    }


}
