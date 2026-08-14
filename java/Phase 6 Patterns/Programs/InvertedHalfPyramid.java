/*
*****
****
***
**
*
*/
import java.util.Scanner;
class InvertedHalfPyramid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }


    }
}