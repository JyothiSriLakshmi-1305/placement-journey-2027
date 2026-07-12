import java.util.Scanner;

public class ShiftOperators{

    public static void main(String args[]){
        //for left shift formula is n*2^n 
        int n=5;
        System.out.println("5<<1 : "+(n<<1));
        System.out.println("5<<1 : "+(n<<2));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of times to left Shift : ");
        int num=sc.nextInt();
        int mul;
        for(int i=0;i<num;i++){
            mul=n<<i;
            System.out.println("5<<"+i+" : "+mul);
        }
        //for right shift fromula n%2^n
        System.out.println("5>>1 : "+(n>>1));

    }
}