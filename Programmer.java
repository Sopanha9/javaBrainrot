public class Programmer extends Employee{ // subclass of employee
    String programmingLang;

    public Programmer() {

    }

    public  Programmer(String programmingLang) {
        this.programmingLang = programmingLang;
    }

    public Programmer(String name, String address,  int age, int experience) {
        super(name, address,age, experience);
        this.programmingLang = programmingLang;
    }
    public void writeCode() {
        System.out.println("Responsible for write programs");
    }


}
