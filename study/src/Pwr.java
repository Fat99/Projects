class Pwr {
    double b;
    int е;
    double val;
    Pwr(double base, int exp) {
        b = base;
        е = exp;
        val = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) val = val * base;
    }
        double get_pwr(){
        return val;
    }
}



/*class Eldar {
    int i;
    Eldar() {};
    void setEldar(int x){
        i = x;
    };
    void kod(){
        if(i % 15 == 0)
            System.out.println("FizzBuzz");
        else if(i % 3 == 0)
            System.out.println("Fizz");
        else if(i % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(i);
    };
}*/
