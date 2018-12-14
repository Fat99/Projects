public class Triangle {
    private double a, b, c;
    private String type;
    private double perimetr;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        //perimetr = a + b + c;
    }

    public double getPerimetr()
    {
        return perimetr=a+b+c;
    }

    public void check1() {
        if ((a <= 0) || (b <= 0) || (c <= 0))
            throw new IllegalArgumentException("Стороны треугольника не могут быть отрицательными.");
    }

    public void check2() {
        if ((a > b + c) || (b > a + c) || (c > b + a))
            throw new IllegalArgumentException("Не выполенно неравенство треугольника. " +
                    "Такого треугольника не может быть.");
        else
            System.out.println("Такой треугольник может существовать. 1-ая сторона: " + a + " ,2-ая сторона: " + b + " ,3-ья сторона: " + c);
    }

    void type() {
//        double max;
//        double min;
//        double aver;
//
//        if (((a != b) && ((b != c)) && (a != c)) || ((a != b) && (b == c)) ||
//                ((a == b) && (a != c)) || ((c != b) && (a == c))) {
//            if ((a >= b) && (a >= c)) {
//                max = a;
//                aver = b;
//                min = c;
//            }
//            if ((b >= a) && (b >= c)) {
//                max = b;
//                aver = a;
//                min = c;
//            }
//            if ((c >= b) && (c >= b)) {
//                max = c;
//                aver = a;
//                min = b;
//            }
//        } else {
//            max = a;
//            min = a;
//            aver = a;
//        }
//
//        if (Math.pow(getMax(), 2) > Math.pow(getAver(), 2) + Math.pow(getMin(), 2)) {
//            System.out.println("Tpeyгoльник тупой.");
//        }
//        if (Math.pow(getMax(), 2) == Math.pow(getAver(), 2) + Math.pow(getMin(), 2)) {
//            System.out.println("Tpeyгoльник прямоугольный.");
//        }
//        if (Math.pow(getMax(), 2) < Math.pow(getAver(), 2) + Math.pow(getMin(), 2)) {
//            System.out.println("Tpeyгoльник острый.");
//        }

        System.out.println("EMPTy");
    }
}
