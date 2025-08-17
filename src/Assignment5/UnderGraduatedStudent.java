public class UnderGraduatedStudent extends Student{
    public String major;
    public int year;

    public UnderGraduatedStudent(String name, int age, String studentId, char grade, String major, int year){
        super(name, age, studentId, grade);
        this.major=major;
        this.year=year;
    }

    @Override
    public void displayInfo(){
        System.out.println();
        System.out.printf("Undergraduate student: %s in year: %d",this.major,this.year);
    }

    public void declareMajor(){
        System.out.println();
        System.out.printf("%s is in major %s in year %d",this.name,this.major,this.year);
    }
}
