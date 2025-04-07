package problems.sumof_allodd_length;

public class Main {

    public static void main(String[] args) {

        int [] arr = {1,4,2,5,3,2,1};
        System.out.println(sumOddLengthSubarrays(arr));

    }

    public static int sumOddLengthSubarrays(int[] arr) {
          int [] pref = new int[arr.length+1];
          pref[0] = 0;
          for(int i=1;i<pref.length;i++){
              pref[i]=pref[i-1]+arr[i-1];
          }
        int sum = pref[arr.length];
          int i = 3, j = 3;

        while(i<pref.length){
              sum+=pref[i]-pref[i-j];
              i++;
              if(i>=pref.length){
                  i = j+2;
                  j = i;
              }
          }

        return sum;
    }
}
