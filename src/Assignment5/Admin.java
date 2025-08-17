public class Admin extends Person{
    public String adminId;
    public String department;

    public Admin(String name, int age, String adminId, String department){
        super(name,age);
        this.adminId=adminId;
        this.department=department;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf(" Admin ID: %s, Department: %s",this.adminId,this.department);
    }

    @Override
    public void celebrateBirthday(){
        super.celebrateBirthday();
        System.out.printf(" %s with ID: %s is now managing the %s department.",this.name,this.adminId,this.department);
    }

    public void manage(){
        System.out.printf(" %s Admin ID: %s is managing the %s department.",this.name,this.adminId,this.department);
        System.out.println();
    }
}
