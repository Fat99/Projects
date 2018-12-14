import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random(System.currentTimeMillis());
        int t = rnd.nextInt(11);
        int l = rnd.nextInt(11);
        char m,n;
        String slovo;
        m = Game.play(t);
        System.out.print("Хотите еще поиграть?");
        Scanner sc = new Scanner(System.in);
        slovo = String.valueOf(sc.next());
        if (slovo.equals("Yes") || slovo.equals("Да") ){
            n = Game.play(l);
        }
        else {
            System.out.println("Всего хорошего.");
        }
    }
}
