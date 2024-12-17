import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {
    public static void reverseArray(int array[]) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

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
        reverseArray(arr);
        System.out.println(arr);
        for (int value : arr) {
            System.out.println(value + "\t");
        }
    }
}
