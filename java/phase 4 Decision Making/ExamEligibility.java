import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Attendance: ");
        int attendance = sc.nextInt();

        System.out.print("Fee Paid? (true/false): ");
        boolean feePaid = sc.nextBoolean();

        if (attendance >= 75) {

            if (feePaid) {
                System.out.println("Eligible for Final Exam");
            } else {
                System.out.println("Pay the Fee First");
            }

        } else {
            System.out.println("Attendance is Below 75%");
        }

        sc.close();
    }
}