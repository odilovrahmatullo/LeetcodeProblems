package problems.find_k_closest_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        System.out.println(findClosestElements(arr, 4, (-1)));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int first = 0;
        int end = arr.length - 1;
        while (end - first >= k) {
            if (Math.abs(arr[first] - x) > Math.abs(arr[end] - x)) first++;
            else end--;
        }
        for (int i = first; i <= end; i++) {
            result.add(arr[i]);
        }
        return result;
    }

}
