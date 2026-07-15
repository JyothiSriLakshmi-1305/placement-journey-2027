//Module 12 output System
public class OutputSystem{
    public static void main(String args[]){
        //using print method
        int age=20;
        double height=5.5;
        System.out.print(age);
        System.out.print(height);
        //output:205.5
        System.out.print("\n");
        String name1="Vasavi";
        String name2=" Engineering College";
        System.out.print(name1);
        System.out.print(name2);
        System.out.print("\n");

        
        //Vasavi Engineering College

        //println method
        System.out.println(true);
        System.out.println('A');
        System.out.println();
        System.out.println(9.66);

        /*output:
        true
        A

        9.66
        */

        //printf method
        //using format specifiers and format arguments
        System.out.println("***********");
        System.out.println("Student Report");
        System.out.println("***********");
        String name="Bhanu";
        int age1=21;
        double cgpa=8.92;
        System.out.printf("Name:%s\nAge:%d\nCGPA:%.2f",name,age1,cgpa);


    }
}