import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<int[]> subsets = subsets(nums);

        // Print the subsets
        for (int[] subset : subsets) {
            System.out.print("[");
            for (int i = 0; i < subset.length; i++) {
                System.out.print(subset[i] + (i < subset.length - 1 ? ", " : ""));
            }
            System.out.println("]");
        }
    }

    public static List<int[]> subsets(int[] nums) {
        List<int[]> result = new ArrayList<>();
        int n = nums.length;
        int totalSubsets = 1 << n;  // 2^n subsets

        for (int i = 0; i < totalSubsets; i++) {
            // Count the number of elements in the subset
            int size = Integer.bitCount(i);
            int[] subset = new int[size];
            int index = 0;

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset[index++] = nums[j];
                }
            }

            result.add(subset);
        }

        return result;
    }
}
