public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow...");
    }
    @Override
    public void move() {
        System.out.println("Cat is moving...");
    }
}