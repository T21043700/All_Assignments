public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println();
        System.out.printf("Name: %s, Age %d.", this.name, this.age);
    }

    public void celebrateBirthday() {
        this.age++;
        System.out.println();
        System.out.printf("%s is now %d years old! Happy Birthday.", this.name, this.age);
    }
}
