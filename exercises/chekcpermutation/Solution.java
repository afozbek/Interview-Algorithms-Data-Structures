import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxNum = 0;

        for (int elem : A) {
            if (elem > maxNum) {
                maxNum = elem;
            }
        }

        if (maxNum == A.length) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int result = solution.solution(new int[] { 3, 4, 1 });

        String message;

        try {
            if (result == 1) {
                message = "Wow your array contains permutation numbers";
            } else {
                message = "Nop, your array is just normal array, sorry...";
            }
            System.out.println(message);

        } catch (Exception ex) {
            ex.getStackTrace();
        }

    }
}