public class Manager extends Employee {
    String teamSize;

    public Manager(){}

    public Manager(String name, String address, int age, int experience, String teamSize) {
        super(name, address, age, experience);
        this.teamSize = teamSize;
    }

    public void report() {
        System.out.println("Reporting in process");
    }
}
