import java.util.*;

public class removeAdjacentVAlues {
    public static void main(String[] args) {
        int arr[] = { 20, 15, 10, 30, 30, 10, 15, 50, 90 };
        Stack<Integer> st = new Stack<Integer>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else {
                st.pop();
            }
        }
        if (st.isEmpty()) {
            System.out.println("-1");
            return;
        }
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
