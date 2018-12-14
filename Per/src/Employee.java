public class Employee extends Person {
    private String address;
    public Employee(int age, String name, String address) {
        super(age, name);
        this.address = address;
    }
}
