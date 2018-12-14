public class Square {
    private double a,b,c;
    public Square(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double sqr(){
        return  Math.sqrt(per()*(per()- a)*(per()- b)*(per()- c));
    }
    double per() {
        return (a+b+c)/2;
    }
}
