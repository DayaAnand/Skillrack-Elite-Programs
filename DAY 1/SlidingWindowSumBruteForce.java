import java.util.ArrayList;

import java.util.*;

public class SlidingWindowSumBruteForce {
    public static void main(String[] args) {
        int arr[] = { 56, 90, 50, 84, 80, 56, 48, 58 };
        List<Integer> ans = new ArrayList<>();
        int k = 2;
        for (int i = 0; i < arr.length - k + 1; i++) {
            int v = 0;
            for (int j = i; j < k + i; j++) {
                v += arr[j];
            }
            ans.add(v);
        }
        for (int i : ans)
            System.out.println(i);

    }
}
