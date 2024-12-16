public class LargestElement {

    public static int findLargestElement(int arr[]) {
        int LargestElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > LargestElement) {
                LargestElement = arr[i];
            }
        }
        return LargestElement;

    }

    public static void main(String[] args) {
        int arr[] = {
                20, 45, 23, 11, 67
        };

        int largetValue = findLargestElement(arr);
        System.out.println(largetValue);
    }
}