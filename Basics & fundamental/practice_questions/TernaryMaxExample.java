public class TernaryMaxExample {
    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 82;

        // Using ternary operator to find the maximum
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}
