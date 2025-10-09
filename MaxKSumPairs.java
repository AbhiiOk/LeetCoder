import java.util.*;

public class MaxKSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking k input
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Create object and call function
        MaxKSumPairs obj = new MaxKSumPairs();
        int result = obj.maxOperations(nums, k);

        System.out.println("Maximum number of K-sum pairs: " + result);
        sc.close();
    }

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums); // Step 1: Sort array
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        // Step 2: Two pointer logic
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count; // Step 3: Return result
    }
}
