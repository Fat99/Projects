import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n,m;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число Фибоначчи, большее 2: ");
        n = s.nextInt();
        m = FibonachiSolver.fib(n);
        System.out.println(m);
    }
}


/*public class Main {
    public static void main(String[] args ) {
        Eldar z = new Eldar();
        for (int i = 1; i <= 100; i++) {
            z.setEldar(i);
            z.kod();
        }
    }*/

