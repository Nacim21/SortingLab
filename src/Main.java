// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // Run your algorithm or code here
        for (int i = 0; i < 10; i++) {
            System.out.println("helllo");
        }
        // Replace this with the actual algorithm you want to time

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        // Convert nanoseconds to milliseconds for readability
        double executionTimeMilliseconds = (double) executionTime / 1_000_000.0;
    }
}