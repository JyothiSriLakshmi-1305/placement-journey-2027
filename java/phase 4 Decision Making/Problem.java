/*
Modify your calculator so the user enters the operator directly:

+
-
*
/

Enter first number: 20
Enter second number: 10
Enter operator: *

Result = 200*/
import java.util.*;
class Problem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a : ");
        
        int a=sc.nextInt();
        System.out.println("Enter b : ");
        int b=sc.nextInt();
        System.out.println("Enter Operator (+,-,*,/): ");
        char ch=sc.next().charAt(0);
        int result=switch(ch){
            case '+'->a+b;
            case '-'->a-b;
            case '*'->a*b;
            case '/'->{if (b == 0) {
                    System.out.println("Division by zero is not allowed.");
                    yield 0;
                }
                yield a/b;
            }
            default->{
                System.out.println("Invalid Operator");
                yield 0;
            }
        };
        System.out.println("Result : "+result);


    }
}