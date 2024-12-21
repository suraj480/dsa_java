import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckSorted {

    public static boolean checkSorted(int array[]) {
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i + 1] < array[i]) {
                isSorted = false;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Input: size of the array
        System.out.println("Enter the size of the array:");
        int size = Integer.parseInt(reader.readLine()); // Read size and parse to integer

        // Initialize the array
        int[] arr = new int[size];

        String[] input = reader.readLine().split(" "); // Read elements as a single line
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(input[i]); // Parse each element to an integer
        }

        boolean checkResult = checkSorted(arr);
        System.out.println("The array is" + (checkResult ? " " : "not") + "sorted");

    }
}