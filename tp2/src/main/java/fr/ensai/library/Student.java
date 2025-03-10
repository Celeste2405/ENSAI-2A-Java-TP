package fr.ensai.library;

public class Student {

    // Attributes
    private String name;
    private int age;
    private int academicYear;
    private boolean isClassDelegate;

    // Constructor to initialize the attributes
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        this.name = name;
        this.age = age;
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }

    // Getter and Setter methods

    // Get the name of the student
    public String getName() {
        return name;
    }

    // Set the name of the student
    public void setName(String name) {
        this.name = name;
    }

    // Get the age of the student
    public int getAge() {
        return age;
    }

    // Set the age of the student
    public void setAge(int age) {
        this.age = age;
    }

    // Get the academic year of the student
    public int getAcademicYear() {
        return academicYear;
    }

    // Set the academic year of the student
    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    // Get if the student is a class delegate
    public boolean isClassDelegate() {
        return isClassDelegate;
    }

    // Set if the student is a class delegate
    public void setClassDelegate(boolean isClassDelegate) {
        this.isClassDelegate = isClassDelegate;
    }

    // toString method to represent the student as a string
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", academicYear=" + academicYear +
                ", isClassDelegate=" + isClassDelegate + "}";
    }

}
