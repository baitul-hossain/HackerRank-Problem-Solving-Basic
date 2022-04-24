package practice;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void solution(List<Integer> arr) {
        Long minSum = 0L;
        Long maxSum = 0L;

        Collections.sort(arr);

        for(int i = 0; i < arr.size() - 1; i++) {
            minSum += arr.get(i);
        }

        for(int i = 1; i <= arr.size() - 1; i++) {
            maxSum += arr.get(i);
        }

        System.out.println(minSum+" "+maxSum);
    }
}
