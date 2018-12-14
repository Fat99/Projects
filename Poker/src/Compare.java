import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input word1: ");
        String word1 = in.nextLine();
        System.out.println("Input word2: ");
        String word2 = in.nextLine();
        boolean c;
        c = word1.length() == word2.length();
        System.out.println(c);
    }
}
