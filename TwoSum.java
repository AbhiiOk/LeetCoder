import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int reqNum = target - nums[i];
            if (map.containsKey(reqNum)) {
                int[] arr = { map.get(reqNum), i };
                return arr;
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Take target input
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Call twoSum method
        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }

        sc.close();
    }
}
