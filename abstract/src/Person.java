import java.util.Objects;

public abstract class Person {
    private int age;
    private String name;
    public boolean verifyName(String name) {
        return name.isEmpty();
    }


    public boolean verifyAge(int age) {
        return age >= 0 && age <= 150;
    }
    public Person(String name, int age) {
        verifyAge(age);
        if (!verifyAge(age)) {
            System.err.println("Default age");
            this.age = 0;
        } else {
            this.age = age;
        }
        verifyName(name);
        if (verifyName(name)){
            System.err.println("Defaul name");
            this.name = "God";
        }
        else{
            this.name = name;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj == this)
            return true;

        if (!(obj instanceof Person))
            return false;

        Person that = (Person) obj;

        return Objects.equals(age, that.age)&& Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result * 17 + age;
        result = result * 17 + name.hashCode();
        return result;
    }

    public void setAge(int age) {
        verifyAge(age);
    }
    public void setName(String name) {
        verifyName(name);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public abstract void info();
    public abstract void salary();
    abstract void voice();
    abstract void hatelevel();
}
