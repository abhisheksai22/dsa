import java.util.List;
import java.util.Stack;

public class BalancedParenthesis {

    static Boolean checkBalanced(String p) {
        Stack<Character> s = new Stack<>();
        List<Character> l = List.of('{', '}', '[', ']', '(', ')');

        for (int i = 0; i < p.length(); i++) {

            if (l.contains(p.charAt(i))) {
                if (p.charAt(i) == '{' || p.charAt(i) == '[' || p.charAt(i) == '(') {
                    s.push(p.charAt(i));
                } else {
                    char pop = s.pop();
                    if (p.charAt(i) == '}') {
                        if (pop != '{') return false;
                    } else if (p.charAt(i) == ')') {
                        if (pop != '(') return false;
                    } else {
                        if (pop != '[') return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String p = "{[(abcd)]}";
        String p1 = "{[(())]";


        Runnable r = (() -> System.out.println(String.valueOf(checkBalanced(p)) + " Thread1 : " +  Thread.currentThread()));
        Thread t = new Thread(r);
        t.setName("T1");
        t.start();
        Runnable r1 = (() -> System.out.println(String.valueOf(checkBalanced(p1)) + " Thread2 : " + Thread.currentThread()));
        Thread t2 = new Thread(r1);
        t.setName("T2");
        t2.start();


    }

}
