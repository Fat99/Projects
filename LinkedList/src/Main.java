import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> stringLinked = new LinkedList<>();
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите 1, если хотите добавить элемент в конец списка:");
        int n = in.nextInt();
        if (n == 1) {
            System.out.println("Введите кол-во слов, которое вы хотите ввести: ");
            int quantity = in.nextInt();
            for(int i = 0; i < quantity; i++) {
                stringLinked.addLast(in.nextLine());
            }
            System.out.println("Введите 2, если хотите добавить элемент в начало списка: ");
            int t = in.nextInt();
            if(t == 2){
                System.out.println("Введите кол-во слов, которое вы хотите ввести: ");
                int quantity2 = in.nextInt();
                for(int i = 1; i < quantity2+1; i++) {
                    stringLinked.addFirst(in.nextLine());
                }
            }
        }
        System.out.println(stringLinked.size());
        for(String s: stringLinked){
            System.out.println(s);
        }*/

	    //LinkedList<String> stringLinked = new LinkedList<>();
        stringLinked.addLast("Loko");
        stringLinked.addLast("yes");
        stringLinked.addFirst("chemp");
        stringLinked.addFirst("5kol");
        stringLinked.addFirst("kek");
        //stringLinked.removeAll();

        //stringLinked.remove(2);
        for(String s: stringLinked){
            System.out.println(s);
        }

        Iterator iterator= stringLinked.descendingIterarot();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(0));
        System.out.println("Введите 1, если хотите удалить элемент по индексу элемент в начало списка: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элемент, который хотите удалить: ");
        //String p = in.nextLine();
        //stringLinked.remove("Loko");
        for (String s : stringLinked) {
            System.out.println(s);
        }
        System.out.println(stringLinked.size());
        System.out.println("Выберете номер элемента, который хотите удалить: ");
        int n = in.nextInt();
        if(n==stringLinked.size()){
            stringLinked.RemoveLast();
        }
        else {
            stringLinked.removeByIndex(n);
        }
        for (String s : stringLinked) {
            System.out.println(s);
        }
        System.out.println(stringLinked.size());
        stringLinked.RemoveLast();
        for (String s : stringLinked) {
            System.out.println(s);
        }
        System.out.println(stringLinked.size());
        stringLinked.remove("kek");
        for (String s : stringLinked) {
            System.out.println(s);
        }
        System.out.println(stringLinked.size());
    }
}