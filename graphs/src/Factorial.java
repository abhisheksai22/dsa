public class Factorial {

    static int recursive(int n) {
        if (n <= 1) return n;
        return n * recursive(n-1);
    }


    static int optimal(int n) {
        int prev = n-1;
        int prev2 = n-2;
        int fact = 1;

        for(int i = n; i>=2;i--) {
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(recursive(5));
        System.out.println(optimal(5));
    }
}
