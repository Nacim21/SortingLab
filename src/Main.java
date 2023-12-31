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



        /*------------------------------------Sorting Algorithms----------------------------------------------------------------*/

        // Starting time for Merge Sort
        long startTime = System.nanoTime();
         SortAlgorithms.mergeSort(wordsForMerge);
        // Sort end time//time calculation // nanosecond to millisecond conversion
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        double executionTimeMilliseconds = (double) elapsedTime / 1_000_000.0;
         //Printing merge runtime
         System.out.println("mergeSort Runtime "+executionTimeMilliseconds+"ms");

         // Starting time for Insertion Sort
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
        SortAlgorithms.quickSort(wordForQuick);
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("quickSort Runtime "+executionTimeMilliseconds+"ms");


         //Starting time for Shell Sort
         startTime = System.nanoTime();
         SortAlgorithms.shellSort(wordForShell);
         // Sort end time//time calculation // nanosecond to millisecond conversion
         endTime = System.nanoTime();
         elapsedTime = endTime -startTime;
         executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
         //Printing bubble runtime
         System.out.println("shellSort Runtime "+executionTimeMilliseconds+"ms");

         //Starting time for Selection Sort
         startTime = System.nanoTime();
         SortAlgorithms.selectionSort(wordForSelection);
         // Sort end time//time calculation // nanosecond to millisecond conversion
         endTime = System.nanoTime();
         elapsedTime = endTime -startTime;
         executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
         //Printing bubble runtime
         System.out.println("selectionSort Runtime "+executionTimeMilliseconds+"ms");


        /*---------------------------------------------------Binary Searching test cases--------------------------------------------- */

        //Starting time for Quick Sort
        startTime = System.nanoTime();
        System.out.println(binarySearch(wordForQuick,"yellow-earth"));
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("Binary Search Runtime yellow-earth "+executionTimeMilliseconds+"ms");

        //Starting time for Quick Sort
        startTime = System.nanoTime();
        System.out.println(binarySearch(wordForQuick,"amarillo"));
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("Binary Search Runtime amarillo "+executionTimeMilliseconds+"ms");

        startTime = System.nanoTime();
        System.out.println(binarySearch(wordForQuick,"AMARyYO"));
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("Binary Search Runtime AMARyYO "+executionTimeMilliseconds+"ms");

        startTime = System.nanoTime();
        System.out.println(binarySearch(wordForQuick,"yellow"));
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("Binary Search Runtime yellow "+executionTimeMilliseconds+"ms");

        /*---------------------------------------------------Sequential Searching test cases--------------------------------------------- */

        startTime = System.nanoTime();
        System.out.println(sequentialSearch(wordForQuick,"yellow-earth"));
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("Sequential Search Runtime yellow-earth "+executionTimeMilliseconds+"ms");

        startTime = System.nanoTime();
        System.out.println(sequentialSearch(wordForQuick,"amarillo"));
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("Sequential Search Runtime amarillo "+executionTimeMilliseconds+"ms");

        startTime = System.nanoTime();
        System.out.println(sequentialSearch(wordForQuick,"AMARyYO"));
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("Sequential Search Runtime AMARyYO "+executionTimeMilliseconds+"ms");

        startTime = System.nanoTime();
        System.out.println(sequentialSearch(wordForQuick,"yellow"));
        // Sort end time//time calculation // nanosecond to millisecond conversion
        endTime = System.nanoTime();
        elapsedTime = endTime -startTime;
        executionTimeMilliseconds = (double) elapsedTime/1_000_000.0;
        //Printing bubble runtime
        System.out.println("Sequential Search Runtime yellow "+executionTimeMilliseconds+"ms");


    }

    //Utilities
    public static void populateArray(String[] array,String filepath) throws FileNotFoundException{
        Scanner fileScanner = new Scanner(new File(filepath));
        for (int i = 0; i < array.length; i++) {
            String current = fileScanner.nextLine();
            array[i] = current;
        }
    }
    public static void isSorted(String[] array){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                System.out.println("Array is not sorted");
                break;
            }
            if(i+1 == array.length-1){
                System.out.println("Array is sorted");
            }
        }
    }
    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
    public static int binarySearch(String first[],String searchString){
        return binarySearch(first, 0, first.length-1,searchString);
    }

    private static int binarySearch(String[] first, int start, int end, String searchString) {
        if(start <= end){

            int mid = start + (end-start) / 2;
            if(first[mid].compareTo(searchString) == 0){
                return mid;
            }
            if(first[mid].compareTo(searchString) > 0){
                return binarySearch(first, start, mid - 1, searchString);
            }
            else{
                return binarySearch(first, mid + 1, end, searchString);
            }

        }
        return -1;
    }

    public static int sequentialSearch(String[] array,String searchString){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(searchString)){
                return i;
            }
        }
        return -1;
    }
}