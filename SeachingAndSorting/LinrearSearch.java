package SeachingAndSorting;

public class LinrearSearch {
    public static void Linear(int arr[], int key) {
        boolean found = false; // Flag to track if key is found

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element is Found At Position: " + i);
                found = true;
                break; // Optional: stop after first match
            }
        }

        if (!found) {
            System.out.println("Element Not Found");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 7, 9, 10 };
        Linear(arr, 4); // Try with a key that doesn't exist
    }
}