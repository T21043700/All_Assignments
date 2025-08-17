package Assignment4.Part_01_StudentManagementSystem;

public class UniversityApp {
    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails("Mostafa", 534, "Testing",3);
        StudentDetails student2 = new StudentDetails("Amira", 112, "Database",4.1);
        StudentDetails student3 = new StudentDetails("Gamal", 223, "Programming");

        //Print student1 details
        student1.displayStudentInfo();
        //Edit student1 GPA
        student1.updateGpa(3.5);
        //Print student1 details again after editing
        student1.displayStudentInfo();

        //Print student1 details
        student2.displayStudentInfo();

        //Print student1 details
        student3.displayStudentInfo();

    }

}
