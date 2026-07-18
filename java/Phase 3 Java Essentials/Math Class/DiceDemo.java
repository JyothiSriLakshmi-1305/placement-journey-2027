import java.util.*;
public class DiceDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many times you want dice ? :");
        int t=sc.nextInt();
        while(t-->0){
        int num=(int)(Math.random()*6)+1;
        System.out.println(num);
        }
    }
}

        