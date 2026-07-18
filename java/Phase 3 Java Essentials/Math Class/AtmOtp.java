import java.util.*;
public class AtmOtp{

    public static void main(String[] args) {
        
        System.out.println("OTP pin Generated SuccessFully :");
        int num=(int)(Math.random()*900000)+100000;
        System.out.println("This is your OTP: "+num);
        
    }
}

        