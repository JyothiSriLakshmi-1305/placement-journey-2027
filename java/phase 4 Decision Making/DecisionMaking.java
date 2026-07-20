//Decision Making
import java.util.Scanner;
class DecisionMaking{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        //SImple if
        if(age>=18){
            System.out.println("Eligible for vote...");
        }
        //if-else
        if(age>=18){
            System.out.println("Eligible for vote...");

        }
        else{
            System.out.println("Not Eligible for vote...");
        }
        System.out.println("Enter 2 NUmbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("Greater NUmber : "+a);
        }
        else{
            System.out.println("Greater NUmber : "+b);
        }
        System.out.println("Maximum of a,b: "+Math.max(a,b));
        //else-if ladder
        System.out.println("Enter Marks : ");
        int marks = sc.nextInt();

        if(marks >= 90){

            System.out.println("Grade A");

        }
        else if(marks >= 80){

            System.out.println("Grade B");

        }
        else if(marks >= 70){

            System.out.println("Grade C");

        }
        else if(marks >= 60){

            System.out.println("Grade D");

        }
        else{

            System.out.println("Fail");

        }
        


    }

}

    
