import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        String[] randomForMerge = {"iasfqwinocoain","MDCASNOK90130","NADSCisdnadncaj","danconcaeq1", ")(&&*^&%$bjivan", "uuuu"};
        String[] randomForInsertion = Arrays.copyOf(randomForMerge, randomForMerge.length);
        String[] randomForBubbble = Arrays.copyOf(randomForMerge, randomForMerge.length);
        String[] randomForQuick = Arrays.copyOf(randomForMerge, randomForMerge.length);
        String[] randomForShell = Arrays.copyOf(randomForMerge, randomForMerge.length);
        String[] randomForSelection = Arrays.copyOf(randomForMerge, randomForMerge.length);

        //********************** TEST CASE FOR MERGE *************************************************************
        SortAlgorithms.mergeSort(randomForMerge);
        Main.printArray(randomForMerge);
        System.out.println();
        Main.isSorted(randomForMerge);
        //********************** TEST CASE FOR INSERTION *************************************************************
        SortAlgorithms.insertionSort(randomForInsertion);
        Main.printArray(randomForInsertion);
        System.out.println();
        Main.isSorted(randomForMerge);
        //********************** TEST CASE FOR BUBBLE *************************************************************
        SortAlgorithms.bubbleSort(randomForBubbble);
        Main.printArray(randomForBubbble);
        System.out.println();
        Main.isSorted(randomForBubbble);
        //********************** TEST CASE FOR QUICK *************************************************************
        SortAlgorithms.quickSort(randomForQuick);
        Main.printArray(randomForQuick);
        System.out.println();
        Main.isSorted(randomForQuick);
        //********************** TEST CASE FOR SHELL *************************************************************
        SortAlgorithms.shellSort(randomForShell);
        Main.printArray(randomForShell);
        System.out.println();
        Main.isSorted(randomForShell);
        //********************** TEST CASE FOR SELECTION *************************************************************
        SortAlgorithms.bubbleSort(randomForSelection);
        Main.printArray(randomForSelection);
        System.out.println();
        Main.isSorted(randomForSelection);
    }
}
