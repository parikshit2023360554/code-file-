import java.util.*;
import java.io.*;

public class min {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        long max = min;

        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }

        return max;

    }

}
