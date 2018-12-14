class Employee extends Person {
    private int salary;

    public boolean verifySalary(int salary) {
        return salary >= 0 && salary <= 100;
    }

    public Employee(String name, int age, int salary) {
        super(name, age);
        if (!verifySalary(salary)) {
            System.err.println("Defaul value 0");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
        this.info();
    }

    public void setSalary(int salary) {
        verifySalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void info() {
        System.out.println("Name: " + getName() + ", age: " + getAge() + ", salary: " + getSalary());
    }
}