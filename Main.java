public  class Main{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        // orr
        // Dog dog = new Dog();
        // Cat cat = new Cat();
        cat.move();
        dog.move();

        cat.makeSound();
        dog.makeSound();

    }
}