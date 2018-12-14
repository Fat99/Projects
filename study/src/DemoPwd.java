public class DemoPwd {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);
        System.out.println(x.b + " в степени " + x.е + " равно " + x.get_pwr());
        System.out.println(y.b + " в степени " + y.е + " равно " + y.get_pwr());
        System.out.println(z.b + " в степени " + z.е + " равно " + z.get_pwr());
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

