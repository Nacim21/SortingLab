import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Declaring and populating the parent array
        String[] wordsForMerge = new String[641392];
        populateArray(wordsForMerge, "resources/dictionary.txt");
        // Declaring and initializing each array
        String[] wordForInsertion = Arrays.copyOf(wordsForMerge, wordsForMerge.length);
        String[] wordForBubble = Arrays.copyOf(wordsForMerge, wordsForMerge.length);
        String[] wordForQuick = Arrays.copyOf(wordsForMerge, wordsForMerge.length);
        String[] wordForShell = Arrays.copyOf(wordsForMerge, wordsForMerge.length);
        String[] wordForSelection = Arrays.copyOf(wordsForMerge, wordsForMerge.length);

        // Starting time for Merge Sort
        long startTime = System.nanoTime();
        SortAlgorithms.mergeSort(wordsForMerge,0,wordsForMerge.length-1);
        // Sort end time//time calculation // nanosecond to millisecond conversion
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        double executionTimeMilliseconds = (double) elapsedTime / 1_000_000.0;
        //Printing merge runtime
        System.out.println("mergeSort Runtime "+executionTimeMilliseconds+"ms");

        //Starting time for Insertion Sort
        startTime = System.nanoTime();
        SortAlgorithms.insertionSort(wordForInsertion);
        //Insertion sort endTime // time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing merge runtime
        System.out.println("insertionSort Runtime "+executionTimeMilliseconds+"ms");

        //Starting time for Bubble Sort
        startTime = System.nanoTime();
        SortAlgorithms.bubbleSort(wordForBubble);
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("bubbleSort Runtime "+executionTimeMilliseconds+"ms");

        //Starting time for Quick Sort
        startTime = System.nanoTime();
        SortAlgorithms.quickSort(wordForQuick, 0, wordForQuick.length-1);
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("quickSort Runtime "+executionTimeMilliseconds+"ms");

        //Starting time for Shell Sort
        startTime = System.nanoTime();
        SortAlgorithms.shellSort(wordForQuick);
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("shellSort Runtime "+executionTimeMilliseconds+"ms");

        //Starting time for Selection Sort
        startTime = System.nanoTime();
        SortAlgorithms.selectionSort(wordForQuick);
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("selectionSort Runtime "+executionTimeMilliseconds+"ms");
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