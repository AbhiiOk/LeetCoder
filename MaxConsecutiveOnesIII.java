import java.util.*;

public class MaxConsecutiveOnesIII {

    // Function to find longest subarray with at most k zeros
    public static int longestOnes(int[] nums, int k) {
        int left = 0;   // window start
        int right = 0;  // window end
        int zeros = 0;  // count of zeros in the current window
        int maxLen = 0; // answer

        while (right < nums.length) {
            // Step 1: expand the window
            if (nums[right] == 0) {
                zeros++;
            }

            // Step 2: shrink window if zeros > k
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            // Step 3: update max length
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

    // Main method for VS Code execution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements (0s and 1s only): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k (maximum zeros allowed to flip): ");
        int k = sc.nextInt();

        // Function call
        int result = longestOnes(nums, k);

        // Output
        System.out.println("Longest subarray length with at most " + k + " zeros flipped: " + result);

        sc.close();
    }
}
