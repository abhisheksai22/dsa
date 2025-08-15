import java.util.Arrays;

public class TwoSum {

    static boolean twoSumProb(int[] arr, int k) {
        int right = arr.length - 1;
        int left = 0;
         while (left < right) {
             if (arr[left] + arr[right] > k) {
                 right--;
             } else if (arr[left] + arr[right] < k) {
                 left ++;
             } else {
                 return true;
             }
         }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11}; // sort this
        Arrays.sort(arr);
        System.out.println(twoSumProb(arr, 9));
    }
}
