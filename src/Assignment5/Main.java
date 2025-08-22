package Assignment5;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ahmed", 30);
        Admin admin1 = new Admin("Sarab", 20, "A101", "Customer Service");
        Teacher teacher1 = new Teacher("Alshafey", 31, "T101", "SW_Testing");
        Student student1 = new Student("Mayar", 24, "S101", 'A');

        Person st1 = new Student("Hasan", 22, "S102", 'B');
        Person ad1 = new Admin("Hanan", 28, "A102", "HR");
        Person te1 = new Teacher("Hassan",29,"T102","Java");

        person1.displayInfo();
        admin1.displayInfo();
        teacher1.displayInfo();
        student1.displayInfo();
        System.out.println();
        System.out.println("----------------------------");

        person1.celebrateBirthday();
        admin1.celebrateBirthday();
        teacher1.celebrateBirthday();
        student1.celebrateBirthday();
        System.out.println();
        System.out.println("----------------------------");

        admin1.manage();
        teacher1.teach();
        student1.study();
        System.out.println();
        System.out.println("----------------------------");


        UnderGraduatedStudent ugStudent1 = new UnderGraduatedStudent("Farida",23,"UGS101",'A',"Law",4);
        GraduateStudent gStudent1 = new GraduateStudent("Ola",26,"GS101",'A',2020);

        ugStudent1.displayInfo();
        ugStudent1.declareMajor();
        ugStudent1.celebrateBirthday();
        ugStudent1.study();
        System.out.println();
        System.out.println("----------------------------");

        gStudent1.displayInfo();
        gStudent1.declareGraduationYear();
        gStudent1.celebrateBirthday();
        gStudent1.study();
        System.out.println();
        System.out.println("----------------------------");

        st1.displayInfo();
        ad1.displayInfo();
        te1.displayInfo();
        System.out.println();
        System.out.println("----------------------------");

    }
}
