import java.io.Console;
import java.util.Arrays;

public class LoginDemo {

    public static void main(String[] args) {

        Console con = System.console();

        if (con == null) {
            System.out.println("Console is not available.");
            return;
        }

        String username =
                con.readLine("Enter Username: ");

        char[] password =
                con.readPassword("Enter Password: ");

        System.out.println("Welcome " + username);
        System.out.println(password);
        Arrays.fill(password, ' ');

        System.out.println("After removed :" + Arrays.toString(password));
    }
}