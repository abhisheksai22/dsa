public class KadaneAlgo {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(arr));
    }

    private static int maxSum(int[] arr) {

        int max = 0;
        int sum = 0;
        int start = 0;
        int end = 0;
        for (int i =0; i< arr.length;i++) {

            sum += arr[i];

            if(sum > max) {
                end = i;
                max = sum;
            }

            if (sum < 0) {
                start = i+1;
                sum = 0;
            }

        }
        System.out.println(start+ " " + end);
        return max;
    }


}
