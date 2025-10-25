package SeachingAndSorting;

class sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class insertion {
    public static void main(String[] args) {
        int arr[] = { 7, 9, 4, 5, 10 };
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = current;
        }
        sorting.printArray(arr);
    }
}
