import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        String[] words = new String[641392];

        populateArray(words, "resources/dictionary.txt");

        printArray(words);
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


}