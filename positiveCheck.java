import java.util.Scanner;

public class positiveCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("The number is postive. ");
        } else if (n < 0) {
            System.out.println("The number is negative. ");
        } else {
            System.out.println("The number is Zero. ");

        }
        sc.close();
    }
}
