public class Math3 {
    public static void decToBeen(int a) {
        int d = 0;
        while (a > 1) {
            d = a % 2 ;
            a = a/2;
            System.out.print(d);
        }
    }
}