import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        String[] words = new String[641392];

        long startTime = System.nanoTime();
        String[] randomStrings = {
                "AbcDeFgHi1",
                "KlmNoPqRs2",
                "TuvWxYz01",
                "3456ABCD78",
                "EfGhIjKlM3",
                "NOpQRsTuV4",
                "WXYZ56789a",
                "bCdEfGhIJ5",
                "KlMnOpQrS6",
                "TUVwXyZ01"
        };
        SortAlgorithms.quicksort(randomStrings,0, randomStrings.length-1);
        // printArray(randomStrings);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        double executionTimeMilliseconds = (double) elapsedTime / 1_000_000.0;

        System.out.println(executionTimeMilliseconds+"ms");


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