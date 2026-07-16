/*next()
Reads one word
Stops at space, tab, or newline
nextLine()
Reads the whole line
Stops only when Enter is pressed
*/
import java.util.Scanner;
public class ScannerExamples{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        //Full name and city
        System.out.println("Enter Your Full Name : ");
        String name=sc.nextLine();
        String city=sc.next();
        System.out.println("Full name: "+name);
        System.out.println("City : "+city);
        //check sc.next();
        //System.out.println("Enter Your Full Name : ");
        //String name1=sc.next();
        //System.out.println("Full name: "+name1);
        
        //nextInt();
        System.out.print("Marks: ");
        int marks = sc.nextInt();
        System.out.println(marks);
        //nextLine()
        sc.nextLine();
        System.out.println("Student Name: ");
        String name3 = sc.nextLine();
        
        System.out.println("Name : "+name3);
        //next double
        System.out.println("Enter Salary : ");
        double sal=sc.nextDouble();
        System.out.println("Salary : "+sal);
        //nextFloat()
        System.out.println("Enter cgpa : ");
        float cgpa=sc.nextFloat();
        System.out.println("Student CGPA : "+cgpa);
        //nextBoolean()
        System.out.println("Enter is he placed in job :");
        boolean isPlaced=sc.nextBoolean();
        System.out.println("Placed or not ?: "+isPlaced);




    }
}