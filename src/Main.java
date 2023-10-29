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
<<<<<<< Updated upstream
        quicksort(randomStrings,0, randomStrings.length-1);
        printArray(randomStrings);
=======
        insertionSort(randomStrings);
        // printArray(randomStrings);
>>>>>>> Stashed changes

      //  populateArray(words, "resources/dictionary.txt");

       // printArray(words);

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

        System.out.println(elapsedTime/1000);


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

    //Algorithms
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
    public static void selectionSort(String[] array) {
        int indexSmallest;

        for (int i = 0; i < array.length - 1; ++i) {
            indexSmallest = i;

            for (int j = i + 1; j < array.length; ++j) {
                if (array[j].compareTo(array[indexSmallest]) < 0) {
                    indexSmallest = j;
                }
            }

            String temp = array[i];
            array[i] = array[indexSmallest];
            array[indexSmallest] = temp;
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
    public static int partition(String[] words, int i, int k) {
        int l;
        int h;
        int midpoint;
        String pivot;
        String temp;
        boolean done;
        /* Pick middle element as pivot */
        midpoint = i + (k - i) / 2;
        pivot = words[midpoint];
        done = false;
        l = i;
        h = k;
        while (!done) {
            /* Increment l while numbers[l] < pivot */
            while ((words[l].compareTo(pivot)) < 0) {
                ++l;
            }
            /* Decrement h while pivot < numbers[h] */
            while ((pivot.compareTo(words[h]) < 0)) {
                --h;
            }
         /* If there are zero or one items remaining,
            all numbers are partitioned. Return h */
            if (l >= h) {
                done = true;
            } else {
            /* Swap numbers[l] and numbers[h],
               update l and h */
                temp = words[l];
                words[l] = words[h];
                words[h]=  temp;

                ++l;
                --h;
            }
        }
        return h;
    }
    public static void quicksort(String[] words, int i, int k) {
        int j;
      /* Base case: If there are 1 or zero entries to sort,
       partition is already sorted */
        if (i >= k) {
            return;
        }
      /* Partition the data within the array. Value j returned
         from partitioning is location of last item in low partition. */
        j = partition(words, i, k);
      /* Recursively sort low partition (i to j) and
         high partition (j + 1 to k) */
        quicksort(words, i, j);
        quicksort(words, j + 1, k);
    }

}