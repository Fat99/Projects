import java.util.Objects;

public class Footballer extends Person {
    private int salary;
    private int hate;
    private int goals;
    public Footballer(String name, int age,int hate,int goals,int salary) {
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
        if (!verifyGoals(goals)) {
            System.err.println("Defaul scores");
            this.goals = 0;
        } else {
            this.goals = goals;
        }
        info();
        voice();
        salary();
        hatelevel();
        golaso();
    }
    public boolean verifyGoals(int goals) {
        return goals >= 0 && goals <= 93;
    }
    public void setGoals(int goals) {
        verifyGoals(goals);
    }
    public boolean verifySalary(int salary) {
        return salary >= 0 && salary <= 100;
    }

    public void setHate(int hate) {
        verifyHate(hate);
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
    public int getHate(){
        return hate;
    }

    public int getGoals() {
        return goals;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj == this)
            return true;

        if (!(obj instanceof Footballer))
            return false;

        Footballer that = (Footballer) obj;

        return Objects.equals(hate, that.hate)&& Objects.equals(salary, that.salary) && Objects.equals(goals, that.goals);
    }

    public int hashCode() {
        int result = 31;
        result = result * 17 + salary;
        result = result * 17 + hate;
        result = result * 17 + goals;
        return result;
    }
    @Override
    public void info() {
        System.out.println("Твое имя: " + getName());
        System.out.println("Твой возраст: " + getAge());
    }

    public void salary() {
        if(salary <= 30 && salary >= 0)
            System.out.println("Твоя зарплата невысокая: "+salary);
        if(salary > 30 && salary<=70)
            System.out.println("Твоя зарплата средняя: "+salary);
        if (salary > 70 && salary<=100)
            System.out.println("Твоя зарплата высокая: "+salary);
    }
    @Override
    void voice() {
        System.out.println("Вы кричите Goal до посиненния.");
    }
    void golaso(){
        if(goals <= 20 && salary >= 0)
            System.out.println("Мало забиваетe. Всего: " + goals + "голов");
        if(goals > 20 && goals<=50)
            System.out.println("Вы забиваете на уровне Кавани. Всего: " + salary +" голов");
        if (goals > 50 && goals<=92)
            System.out.println("Вы забиваете на уровне Роналду. Всего: " + salary +" голов");
        if (goals == 93)
            System.out.println("Вы забиваете на уровне Месси(Бога футбола). Всего: " + salary +" голов");
    }
    void hatelevel() {
        if(hate <= 3 && hate >= 0)
            System.out.println("Вас все любят. Ваш уровень ненависти: " + hate);
        if(hate > 3 && hate <=7)
            System.out.println("Вас не все любят. Ваш уровень ненависти: " + hate);
        if (hate > 7 && hate <=10)
            System.out.println("Вас ненавидят. Ваш уровень ненависти: " + hate);
    }
}
