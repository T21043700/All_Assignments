package InterfaceDemo;

public class Cow implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating grass");
    }
}
