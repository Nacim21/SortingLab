import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        String[] words = new String[641392];
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
        insertionSort(randomStrings);
        printArray(randomStrings);

      //  populateArray(words, "resources/dictionary.txt");

       // printArray(words);
        long startTime = System.nanoTime();

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;


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

    public static void bubbleSort(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static void selectionSort(int [] numbers) {
        int i;
        int j;
        int indexSmallest;
        int temp;      // Temporary variable for swap

        for (i = 0; i < numbers.length - 1; ++i) {

            // Find index of smallest remaining element
            indexSmallest = i;
            for (j = i + 1; j < numbers.length; ++j) {

                if (numbers[j] < numbers[indexSmallest]) {
                    indexSmallest = j;
                }
            }

            // Swap numbers[i] and numbers[indexSmallest]
            temp = numbers[i];
            numbers[i] = numbers[indexSmallest];
            numbers[indexSmallest] = temp;
        }
    }
    public static void insertionSort(String [] words) {
        int i;
        int j;
        String temp;      // Temporary variable for swap

        for (i = 1; i < words.length; ++i) {
            j = i;
            // Insert numbers[i] into sorted part
            // stopping once numbers[i] in correct position
            while (j > 0 && words[j].compareTo(words[j - 1])<0) {

                // Swap numbers[j] and numbers[j - 1]
                temp = words[j];
                words[j] = words[j - 1];
                words[j - 1] = temp;
                --j;
            }
        }
    }



}