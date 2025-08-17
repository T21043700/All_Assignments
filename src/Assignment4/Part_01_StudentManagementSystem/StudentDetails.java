package Assignment4.Part_01_StudentManagementSystem;

public class StudentDetails {
    private String name;
    private int studentId;
    private String major;
    private double gpa = 0.0;

    public static void main (String [] args){

    }

    public StudentDetails (String name, int studentId, String major, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }
    public StudentDetails (String name, int studentId, String major){
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }
    
    public void displayStudentInfo(){
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Major: " + major);
        System.out.println("Student GPA: " + gpa);
        System.out.println();
    }
    public void updateGpa(double newGpa){
        System.out.println("Your current GPA is: " + gpa);
        this.gpa = newGpa;
        System.out.println("Your new GPA is: " + newGpa);
        System.out.println();
    }
}
