import java.util.*;

class SuccessfullPairs {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); // Sort potions
        int n = spells.length;
        int m = potions.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int left = 0, right = m - 1;
            int index = m; // default: no potion satisfies

            // Binary search to find first potion where spell * potion >= success
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long)spell * potions[mid] >= success) {
                    index = mid;       // possible answer
                    right = mid - 1;   // search left to find first occurrence
                } else {
                    left = mid + 1;    // search right
                }
            }

            // Number of successful pairs = total potions - index
            result[i] = m - index;
        }

        return result;
    }

    // Optional main method to test
    public static void main(String[] args) {
        SuccessfullPairs sol = new SuccessfullPairs();
        int[] spells = {10, 20};
        int[] potions = {1, 2, 3, 4};
        long success = 20;

        int[] res = sol.successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(res)); // Output: [2,4]
    }
}
