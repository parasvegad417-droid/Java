package SeachingAndSorting;

// O(nlogn)

public class MergeSort {

    public static void concquer(int si, int ei, int mid, int ar[]) {
        int merge[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (ar[idx1] <= ar[idx2]) {
                merge[x++] = ar[idx1++];
            } else {
                merge[x++] = ar[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[x++] = ar[idx1++];
        }

        while (idx2 <= ei) {
            merge[x++] = ar[idx2++];
        }

        for (int i = 0, j = si; i < merge.length; i++, j++) {
            ar[j] = merge[i];
        }
    }

    public static void divide(int si, int ei, int ar[]) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2; // si + (ei-si)/2;
        divide(si, mid, ar);
        divide(mid + 1, ei, ar);
        concquer(si, ei, mid, ar);
    }

    public static void main(String[] args) {
        int ar[] = { 4, 3, 5, 6, 9, 1, 2 };
        int n = ar.length;

        divide(0, n - 1, ar);
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i] + " ");

        }
        System.out.println();

    }
}
