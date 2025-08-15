import java.util.ArrayList;
import java.util.List;

public class NearestPalindrome {



    static long nearestPal(long n) {

        List<Integer> integers = listOfPalindromes(n);
        return integers.get(4);

    }

    static List<Integer> listOfPalindromes(Long n) {
        List<Integer> l = new ArrayList<>();
        Integer forward = Math.toIntExact(n+1);
        Integer backward = Math.toIntExact(n-1);
        boolean isForwardPal ;
        boolean isBackwardPal ;

        while (l.size() < 8) {


            isForwardPal = isPalindrome(forward);
            isBackwardPal = isPalindrome(backward);

            if (isBackwardPal && isForwardPal) {
                if (n - backward <= forward -n) {
                    l.add(backward);
                    l.add(forward);
                } else {
                    l.add(forward);
                    l.add(backward);
                }
            } else if (isBackwardPal) {
                l.add(backward);
            } else if (isForwardPal) {
                l.add(forward);
            }

            forward++;
            backward--;
        }
        return l;
    }


    private static boolean isPalindrome(Integer n) {
        String s = Integer.toString(n);
        int j = s.length()-1;
        for (int i =0; i< s.length()/2;i++) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(nearestPal(111));

    }
}
