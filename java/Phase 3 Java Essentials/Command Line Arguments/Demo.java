/* Write a program that accepts two numbers as command-line arguments and prints:

First Number
Second Number
Sum
Difference
Product*/
class Demo{
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if (args.length != 2) {
           System.out.println("Please provide exactly two numbers.");
           return;
        }
        System.out.println("First Number : "+a);
        System.out.println("Second Number : "+b);
        //System.out.println("First Number : "+Integer.parseInt(args[0]));
        //System.out.println("Second Number : "+Integer.parseInt(args[1]));
        int sum=a+b;
        int diff=(a-b);
        int pro=a*b;
        System.out.println("Sum of 2 Numbers : "+sum);
        System.out.println("Difference of 2 Numbers: "+diff);
        System.out.println("Product of 2 Numbers : "+pro);
        //args.length
        System.out.println("Total Arguments : "+args.length);

        
    }
}