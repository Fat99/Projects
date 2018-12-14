import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        char [] m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для перевода из десятичной в двоичную: ");
        n = sc.nextInt();
        m = Math.decToBeen(n);
        for(int i=0; m[i]!='\0';i++)
            System.out.print(m[i]);
    }
}
