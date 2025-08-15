import java.util.Arrays;

public class RemoveDuplicatesInSortedArray {

// find unique elements and also modify array

    public static void main(String[] args) {

        int[] l = {1,1,2,2,2,2,3,3,5,5,5,5,5,6,6,6,6};

        System.out.println(countAndRemoveDuplicated(l));
        System.out.println(Arrays.toString(l));
    }

    private static int countAndRemoveDuplicated(int[] l) {

        int i = 0;
        for (int j = 1; j < l.length; j++) {
            if(l[i] == l[j]) {
                continue;
            }
            l[i+1] = l[j];
            i++;
        }
        return i+1;
    }

}

