public class SortAlgorithms {
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
        String temp;

        for (i = 1; i < words.length; ++i) {
            j = i;
            while (j > 0 && words[j].compareTo(words[j - 1])<0) {
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

        midpoint = i + (k - i) / 2;
        pivot = words[midpoint];
        done = false;
        l = i;
        h = k;
        while (!done) {
            while ((words[l].compareTo(pivot)) < 0) {
                ++l;
            }
            while ((pivot.compareTo(words[h]) < 0)) {
                --h;
            }
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
    public static void merge(String[] words, int i, int j, int k) {
        int mergedSize = k - i + 1;       // Size of merged partition
        String mergedNumbers [] = new String[mergedSize]; // Temporary array for merged numbers
        int mergePos;                     // Position to insert merged number
        int leftPos;                      // Position of elements in left partition
        int rightPos;                     // Position of elements in right partition

        mergePos = 0;
        leftPos = i;                      // Initialize left partition position
        rightPos = j + 1;                 // Initialize right partition position

        // Add smallest element from left or right partition to merged numbers
        while (leftPos <= j && rightPos <= k) {
            if (words[leftPos].compareTo(words[rightPos])<0) {
                mergedNumbers[mergePos] = words[leftPos];
                ++leftPos;
            }
            else {
                mergedNumbers[mergePos] = words[rightPos];
                ++rightPos;
            }
            ++mergePos;
        }

        // If left partition is not empty, add remaining elements to merged numbers
        while (leftPos <= j) {
            mergedNumbers[mergePos] = words[leftPos];
            ++leftPos;
            ++mergePos;
        }

        // If right partition is not empty, add remaining elements to merged numbers
        while (rightPos <= k) {
            mergedNumbers[mergePos] = words[rightPos];
            ++rightPos;
            ++mergePos;
        }

        // Copy merge number back to numbers
        for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
            words[i + mergePos] = mergedNumbers[mergePos];
        }
    }

    public static void mergeSort(String[] words, int i, int k) {
        int j;

        if (i < k) {
            j = (i + k) / 2;  // Find the midpoint in the partition

            // Recursively sort left and right partitions
            mergeSort(words, i, j);
            mergeSort(words, j + 1, k);

            // Merge left and right partition in sorted order
            merge(words, i, j, k);
        }
    }

}
