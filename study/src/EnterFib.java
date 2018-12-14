public class EnterFib {
    public static void main(String[] args) {
        int i,d = 0,j = 0,l = 1;
        for (i = 0; i < 4; i++) {
            d = j + l;
            j = l;
            l = d;
        }
        System.out.println(d);
    }
}
