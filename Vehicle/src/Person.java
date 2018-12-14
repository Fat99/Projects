public class Person {
    private int age;
    private String name;
    public void verifyName(String name){
        if (name.isEmpty()) throw new IllegalArgumentException("Name can't be empty string");
    }
    public void verifyAge(int age){
        if (age < 0 || age > 150) throw new IllegalArgumentException("Age can't be less 0 and more 150");
    }
    public Person(String name, int age) {
        verifyName(name);
        verifyAge(age);

        this.name = name;
        this.age = age;

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
}

