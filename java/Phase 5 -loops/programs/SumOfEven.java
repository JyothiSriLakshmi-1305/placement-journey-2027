import java.util.Scanner;
class SumOfEven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            if(i%2==0)
            {
            sum=sum+i;
            
            }
            i++;
        }
        System.out.println("Sum of even numbers : "+sum);

    }
}