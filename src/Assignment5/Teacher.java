public class Teacher extends Person{
    public String teacherId;
    public String subject;

    public Teacher(String name, int age, String teacherId, String subject){
super(name,age);
this.teacherId=teacherId;
this.subject=subject;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(" Employee ID: %s, Subject: %s", this.teacherId, this.subject);
    }

    @Override
    public void celebrateBirthday(){
        super.celebrateBirthday();
        System.out.printf(" %s with Id: %s is now teaching %s",this.name,this.teacherId,this.subject);
    }

    public void teach(){
        System.out.printf(" %s EmpID: %s is teaching %s",this.name,this.teacherId,this.subject);
        System.out.println();
    }
}
