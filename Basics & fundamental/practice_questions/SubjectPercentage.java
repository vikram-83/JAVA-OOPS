public class SubjectPercentage {
    public static void main(String[] args) {
        // Marks obtained out of 100 in each subject
        double math = 85;
        double science = 90;
        double english = 78;
        double history = 88;
        double geography = 92;

        // Calculate total marks
        double totalMarks = math + science + english + history + geography;
        
        // Calculate percentage (Total Marks / Maximum Marks * 100)
        double percentage = (totalMarks / 500.0) * 100;

        System.out.println("Total Marks Obtained: " + totalMarks + " / 500");
        System.out.println("Percentage: " + percentage + "%");
    }
}
