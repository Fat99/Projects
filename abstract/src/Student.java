import java.util.Objects;

public class Student extends Person {
    private int salary;
    private int hate;
    public Student(String name, int age,int salary,int hate) {
        super(name, age);
        if (!verifySalary(salary)) {
            System.err.println("Defaul salary");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
        if (!verifyHate(hate)) {
            System.err.println("Defaul hatelevel");
            this.hate = 0;
        } else {
            this.hate = hate;
        }
        info();
        voice();
        salary();
        hatelevel();
    }


    public boolean verifyGoals(int goals) { return goals >= 0 && goals <= 93; }
    public void setHate(int hate) {verifyHate(hate); }
    public boolean verifySalary(int salary) {
        return salary >= 0 && salary <= 40;
    }
    public void setSalary(int salary) {
        verifySalary(salary);
    }
    public boolean verifyHate(int hate) {
        return hate >= 0 && hate <= 10;
    }
    public int getSalary() {
        return salary;
    }
    public int getHate() {
        return hate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj == this)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student that = (Student) obj;

        return Objects.equals(hate, that.hate)&& Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result * 17 + salary;
        result = result * 17 + hate;
        return result;
    }
    @Override
    public void info() {
        System.out.println("Твое имя: " + getName());
        System.out.println("Твой возраст: " + getAge());
    }

    @Override
    public void salary() {
        if(salary <= 20 && salary >= 0)
            System.out.println("Твоя зарплата невысокая: "+salary);
        if(salary > 20 && salary<=30)
            System.out.println("Твоя зарплата средняя: "+salary);
        if (salary > 30 && salary<=40)
            System.out.println("Твоя зарплата высокая: "+salary);
    }

    @Override
    void voice() {
        System.out.println("Вы говорите кек и продолжаете ботать.");
    }

    @Override
    void hatelevel() {
        if(hate <= 3 && hate >= 0)
            System.out.println("Вас все любят. Ваш уровень ненависти: " + hate);
        if(hate > 3 && hate <=7)
            System.out.println("Вас не все любят. Ваш уровень ненависти: " + hate);
        if (hate > 7 && hate <=10)
            System.out.println("Вас ненавидят. Ваш уровень ненависти: " + hate);
    }
}
