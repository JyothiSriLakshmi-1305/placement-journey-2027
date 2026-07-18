import java.util.Scanner;
class MathDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Constants PI & E
        //Area of circle PI*r*r
        System.out.println("Enter radius of circle : ");
        double r=sc.nextInt();
        double Area=Math.PI*r*r;
        System.out.printf("Area of circle : %.2f",Area);

        //Circumference of circle 2*PI*r;
        double c=2*Math.PI*r;
        System.out.printf("%nCircumference of Circle : %.2f",c);

        //Math.abs();
        System.out.printf("%n");
        System.out.println("Enter 2 numbers : ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float absVal=Math.abs(b);
        System.out.println(absVal);
        //Math.max();
        System.out.println("Max of a,b : "+Math.max(a,b));
        //Math.min();
        System.out.println("Min of a,b : "+Math.min(a,b));

        //Creating Scientific Calculator
        System.out.println("****Calculator*****");
        System.out.println("Enter Value for Calculation : ");
        double val=sc.nextDouble();
        int t=3;
        while(t-->0){
        System.out.println("Choose Calculation : ");
        System.out.println("1.Square of Value...");
        System.out.println("2.Cubic Root");
        System.out.println("3.Power ..");
        int input=sc.nextInt();
        switch(input){
            case 1:
                //Math.sqrt
                double sq=Math.sqrt(val);
                System.out.println("Square of value : "+sq);
                break;

            case 2:
                //Math.cbrt
                double cubic=Math.cbrt(val);
                System.out.println("Cubic root of Val : "+cubic);
                break;
            case 3:
                //Math.pow(,)
                double power=Math.pow(val,val);
                System.out.println("Power of numbers : "+power);
                break;
            default:
                System.out.println("Choose correct one ...");
        }
    }



    }
}