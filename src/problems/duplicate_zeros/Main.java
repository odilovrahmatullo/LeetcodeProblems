package problems.duplicate_zeros;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int[] newArray = arr.clone();
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n && j < n; i++) {
            arr[j++] = newArray[i];
            if (newArray[i] == 0 && j < n) {
                arr[j++] = 0;
            }
        }

    }
}
