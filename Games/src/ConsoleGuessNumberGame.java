import java.util.Random;
import java.util.Scanner;

public class ConsoleGuessNumberGame {
    private static final int MAX_ATTEMPTS = 3;
    private int hiddenNumber;
    private Scanner scanner;
    private int attempt = 1;
    private boolean hasWinner;

    public ConsoleGuessNumberGame() {
        scanner = new Scanner(System.in);
        hiddenNumber = new Random(System.currentTimeMillis()).nextInt(10);
    }

    public void play() {
        System.out.println("Я загадал число от 0 до 10. У вас есть три попытки его отгадать.");
        while (attempt <= MAX_ATTEMPTS && !hasWinner) {
            attemptToGuess();
        }
        if (hasWinner) {
            System.out.println(String.format("Вы выиграли! Верно! У вас получилось с попытки: %d.", attempt));
        } else {
            System.out.println("Вы проиграли.");
        }
    }

    private void attemptToGuess() {
        System.out.println(String.format("Попытка номер: %d.", attempt));
        System.out.println("Введите число от 0 до 10:");
        int number = scanner.nextInt();
        if (number == hiddenNumber) {
            hasWinner = true;
            return;
        }
        if (number > hiddenNumber) {
            System.out.println("Введенное число больше загаданного.");
        } else {
            System.out.println("Введенное число меньше загаданного.");
        }
        attempt++;
    }
}