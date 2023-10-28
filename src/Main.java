// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // long startTime = System.nanoTime();

        // Run your algorithm or code here
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("helllo");
        // }
        // Replace this with the actual algorithm you want to time

        // long endTime = System.nanoTime();
        // long executionTime = endTime - startTime;

        // Convert nanoseconds to milliseconds for readability
        // double executionTimeMilliseconds = (double) executionTime / 1_000_000.0;


        String[] test = {"Cat","Car","Dog","Bus","Goat","Hello","Minecraft","PLAYBOI CARTER JORDAN JARTER","HOW","no way","perc","percocet","perc 30","beretta"};
        bubbleSort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
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