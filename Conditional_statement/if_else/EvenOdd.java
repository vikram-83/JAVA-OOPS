import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
        sc.close();
    }
}
