import java.util.*;

public class maxproductSubarray{

    // Function to find maximum product subarray
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        int cprod = 1;

        // Forward pass
        for (int i = 0; i < n; i++) {
            cprod *= nums[i];
            ans = Math.max(ans, cprod);
            if (cprod == 0) cprod = 1;
        }

        // Backward pass
        cprod = 1;
        for (int i = n - 1; i >= 0; i--) {
            cprod *= nums[i];
            ans = Math.max(ans, cprod);
            if (cprod == 0) cprod = 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        maxproductSubarray sol = new maxproductSubarray();
        int result = sol.maxProduct(nums);

        System.out.println("Maximum Product Subarray = " + result);
        sc.close();
    }
}
