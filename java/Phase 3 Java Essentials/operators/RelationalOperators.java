/*Write a Java program to check:

Is age greater than or equal to 18?
Is marks greater than or equal to 35?
Is salary greater than 50,000?
Are two numbers equal?

Print the results.*/
//Relational operators always return boolean values
public class RelationalOperators{
    public static void main(String args[]){
        int age=20;
        int marks=80;
        int salary=70000;
        int num1=10,num2=20;
        System.out.println("Is age greater than or equal to 18 "+(age>=18));
        System.out.println("is marks greater than or equal to 35 "+(marks>=35));
        System.out.println("is salary greater than 50000 "+(salary>50000));
        System.out.println("Are 2 numbers equal "+(num1==num2));
    }
}
/*
output:
Is age greater than or equal to 18 true
is marks greater than or equal to 35 true
is salary greater than 50000 true
Are 2 numbers equal false */  
