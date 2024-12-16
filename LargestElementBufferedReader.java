import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestElementBufferedReader {

    // Method to find the largest element in an array
    public static int findLargestElement(int[] arr) {
        int largestElement = arr[0]; // Initialize with the first element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;
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

        // Find the largest element
        int largestValue = findLargestElement(arr);

        // Output the largest element
        System.out.println("The largest element in the array is: " + largestValue);
    }
}
