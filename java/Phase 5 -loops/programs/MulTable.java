import java.util.Scanner;
class MulTable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt();
        
        int i=1;
        while(i<=n){
            //i*n;
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
        

    }
}