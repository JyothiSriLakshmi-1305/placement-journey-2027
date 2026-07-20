/* Create a calculator using the modern switch.

Supported operators:

+
-
*
/

Return the answer using a switch expression.0*/
import java.util.*;
class SwitchModern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a : ");
        
        int a=sc.nextInt();
        System.out.println("Enter b : ");
        int b=sc.nextInt();
        System.out.println("Choose Operation...");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int input=sc.nextInt();
        int result=switch(input){
            case 1->a+b;
            case 2->a-b;
            case 3->a*b;
            case 4->{
                if (b == 0) {
                    System.out.println("Division by zero is not allowed.");
                    yield 0;
                }
                yield a / b;
            }
                
            default->{
                System.out.println("Invalid Choice");
                yield 0;
            }
        };
        System.out.println("Result = " + result);
        sc.close();
    }
}