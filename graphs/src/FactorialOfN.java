import java.util.Arrays;

public class FactorialOfN {

    public static int factOfN(int n) {
        if (n<=2) return n;
        return n * factOfN(n-1);
    }

    //using DP


    public static void main(String[] args) {
        System.out.println(factOfN(6));

        int[] dp = new int[6];
        Arrays.fill(dp, -1);
        System.out.println(factOfNUsingDp(5, dp));
    }

    static int factOfNUsingDp(int i, int[] dp) {
        System.out.println(i + " "  + Arrays.toString(dp));
        if (i<=1) return i;

        if(dp[i] != -1) return dp[i];

        return  dp[i] = i*factOfNUsingDp(i-1, dp);

    }


}
