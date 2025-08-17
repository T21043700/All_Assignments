public class Student extends Person{
    public String studentId;
    public char grade;

    public Student(String name, int age, String studentId, char grade){
        super(name, age);
        this.studentId=studentId;
        this.grade=grade;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(" Student ID: %s, Grade: %s.",this.studentId,this.grade);
    }

    public void study(){
        System.out.printf(" %s ID: %s is studying.",this.name,this.studentId);
        System.out.println();
    }
}
