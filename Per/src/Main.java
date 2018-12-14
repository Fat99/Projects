public class Main {
    public static void main(String[] args) {
        Person p = new Person(27, "Aleksandr");
        Employee e = new Employee(27, "Aleksandr", "Sberbank");
        PhoneBook.find(p);
        PhoneBook.find(e);
    }
}
