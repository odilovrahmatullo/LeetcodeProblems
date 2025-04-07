package find_pivot_integer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }

    public static int pivotInteger(int n) {
//        int leftSum = 0;
//        int rightSum = 0;
//        int sum = (n+1)*n/2;
//        for(int i = 1; i < n; i++){
//            leftSum = leftSum + i;
//            rightSum = sum-(leftSum-i);
//            if(leftSum == rightSum){
//                return i;
//            }
//        }
//        return -1;
        if(n==1) return 1;
        int summa = n*(n+1)/2;
        int left = 0;
        int right = n;
        while (left<right){
            int middle = (right+left)/2;
            int byMiddleSumma = middle*(middle+1) / 2;
            if(byMiddleSumma<summa-byMiddleSumma+middle){
                left=middle+1;
            }
            else if(byMiddleSumma==summa-byMiddleSumma+middle){
                return middle;
            }
            else{
                right = middle - 1;
            }

        }


        return -1;
    }
}
