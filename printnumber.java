import java.util.Scanner;

public class printnumber {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Enter the number:");
        int aman = num.nextInt();

        int sum = 0;

        for (int i = 1; i <= aman; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        num.close();
    }
}