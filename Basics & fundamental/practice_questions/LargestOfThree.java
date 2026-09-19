public class LargestOfThree {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 89;
        int num3 = 54;

        // Check if num1 is greater than both num2 and num3
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } 
        // Check if num2 is greater than both num1 and num3
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } 
        // If neither, then num3 must be the largest
        else {
            System.out.println(num3 + " is the largest number.");
        }
    }
}
