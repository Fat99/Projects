class FibonachiSolver{
    public static int fib(int n){
        int a = 0,b = 1,c = 0;
        for (int i = 0; i < n-2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
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
