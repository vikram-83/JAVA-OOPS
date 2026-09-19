public class ExplicitCastingExample {
    public static void main(String[] args) {
        double doubleValue = 78.99;
        
        // Manual / Explicit type casting from double to int
        int intValue = (int) doubleValue; 

        System.out.println("Original double value: " + doubleValue);
        System.out.println("Manually casted integer value (decimals truncated): " + intValue);
    }
}
