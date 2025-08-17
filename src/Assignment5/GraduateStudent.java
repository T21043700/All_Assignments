public class GraduateStudent extends Student{
    public int graduationYear;

    public GraduateStudent(String name, int age, String studentId, char grade, int graduationYear ){
        super(name, age, studentId, grade);
        this.graduationYear=graduationYear;
    }

    @Override
    public void study(){
        super.study();
        System.out.println();
        System.out.printf("%s graduated in %d",this.name,this.graduationYear);
    }

    public void declareGraduationYear(){
        System.out.printf("%s has graduated in %d.",this.name,this.graduationYear);
        System.out.println();
        System.out.printf("The person %s has graduated in %d, in age %d%n",this.name,this.graduationYear,this.age);
        System.out.println();
    }
}
