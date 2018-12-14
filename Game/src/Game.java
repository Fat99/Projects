import java.util.Random;
import java.util.Scanner;

public class Game {
    public static char play(int r) {
        Random rnd = new Random(System.currentTimeMillis());
        r = rnd.nextInt(11);
        System.out.print("Задумано число от 0 до 10. Попытайтесь его угадать: " );
        int answer[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            answer[i] = sc.nextInt();
            if (r != answer[i]) {
                System.out.print("Вы не угадали. У вас осталось " + (2 - i) + " попытки: ");
            } else {
                System.out.println("Вы отгадали.");
            }
            if (r == answer[i]) break;
        }
        if (r != answer[1] || r != answer[1] || r != answer[2]) {
            System.out.println("Правильный ответ: " + r);
        }
        return 0;
    }
}
