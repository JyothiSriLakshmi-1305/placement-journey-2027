import java.io.*;

// Driver Class
class UnaryOperators{

    public static void main(String[] args){
        
        // Integer declared
        int a = 8;
        int b = 10;

        // Using unary operators
        System.out.println("Preincrement : " + (++a));
        System.out.println("Postincrement : " + (a++));
        System.out.println("Predecrement : " + (--a));
        System.out.println("Postdecrement : " + (a--));
        System.out.println("Predecrement : " + (--b));
        System.out.println("Postdecrement : " + (b--));
        
    }
}

