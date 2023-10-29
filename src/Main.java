import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Declaring and populationg
        String[] words = new String[641392];
        populateArray(words, "resources/dictionary.txt");

        // System timer start and sorting
        long startTime = System.nanoTime();
        SortAlgorithms.quicksort(words, 0, 0);
      
        // Sort end and time elapsed calculation
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        double executionTimeMilliseconds = (double) elapsedTime / 1_000_000.0;

        //Runtime 
        System.out.println("Quicksort runtime"+executionTimeMilliseconds+"ms");
        

        //sex
    }

    //Utilities
    public static void populateArray(String[] array,String filepath) throws FileNotFoundException{
        Scanner fileScanner = new Scanner(new File(filepath));
        for (int i = 0; i < array.length; i++) {
            String current = fileScanner.nextLine();
            array[i] = current;
        }
    }
    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }

}