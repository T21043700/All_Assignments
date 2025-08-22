package Assignment6.Polymorphism_Abstraction_Interface.PolymorphismDemo;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}
