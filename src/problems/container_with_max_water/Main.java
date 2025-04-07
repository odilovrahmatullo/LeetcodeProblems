package container_with_max_water;

public class Main {

    public static void main(String[] args) {
       int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int summa = 0, temp = 0;
        while(left<=right){
            if(summa>temp){
                temp = summa;
            }
           if(height[left]>=height[right]){
               summa = height[right]*Math.abs((left-right));
               right --;
           }
           else {
               summa = height[left]*Math.abs((right-left));
               left++;
           }
        }
        return temp;
    }
}
