public class Employee { // super class
    String name;
    String address;
    int age;
    int experience;

    public Employee() {

    }

    public Employee(String name, String address, int age, int experience) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.experience = experience;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
