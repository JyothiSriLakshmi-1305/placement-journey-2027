import java.util.Scanner;
class InvertedFullPyramid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*r-2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}