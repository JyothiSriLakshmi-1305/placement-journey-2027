/******
 ****
  ***
   **
    *
Inverted right-aligned pyramid:
Spaces = i - 1
Stars  = n - i + 1
*/
import java.util.Scanner;
class InvertedRightAlignedHalfPyramid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            //for spaces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=r-i+1;j++){
                System.out.print("*");
            }
            
            System.out.println();

        }
    }
}