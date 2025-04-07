package first_bad_version;

public class Main {
    public static void main(String[] args) {
        /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

        //it is just answer to leetcode question



    }
    /*public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left<right){
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }
            else{
                left = mid+1;
            }

        }

        return left;
    }*/
}
