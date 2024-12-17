import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOccurences {

    public static int findTargetElement(int array[], int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Input: size of the array
        System.out.println("Enter the size of the array:");
        int size = Integer.parseInt(reader.readLine()); // Read size and parse to integer

        // Initialize the array
        int[] arr = new int[size];

        // Input: array elements
        System.out.println("Enter " + size + " elements of the array (space-separated):");
        String[] input = reader.readLine().split(" "); // Read elements as a single line
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(input[i]); // Parse each element to an integer
        }
        System.out.println("Enter the target element: ");
        int targetElement = Integer.parseInt(reader.readLine());

        int index = findTargetElement(arr, targetElement);

        System.out.println(index);

    }

}
