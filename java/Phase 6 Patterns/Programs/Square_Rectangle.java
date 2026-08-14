import java.util.Scanner;
class Square_Rectangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter l,b for rectangle: ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                System.out.print("J ");
            }
            System.out.println();
        }
        System.out.println("Enter side for square: ");
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print("O ");
            }

            System.out.println();
        }
    }
}