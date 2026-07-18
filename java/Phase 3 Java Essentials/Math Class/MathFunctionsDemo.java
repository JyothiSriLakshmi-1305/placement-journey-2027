public class MathFunctionsDemo {

    public static void main(String[] args) {

        double num = 5.67;

        // ceil()
        System.out.println("Original Number : " + num);
        System.out.println("Ceil            : " + Math.ceil(num));

        // floor()
        System.out.println("Floor           : " + Math.floor(num));

        // round()
        System.out.println("Round           : " + Math.round(num));

        // random()
        System.out.println("Random (0.0 to 1.0): " + Math.random());

        // Random number between 1 and 10
        int random = (int)(Math.random() * 10) + 1;
        System.out.println("Random (1 to 10): " + random);
    }
}