import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 15, 10, 6, 20 };
        Stack<Integer> st = new Stack<>();
        int nextGreater;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                st.push(arr[i]); // last ele is pushed
            } else if (st.peek() > arr[i]) { // eleemnt in stack > traversing ele
                nextGreater = st.peek();
                st.push(arr[i]);
                arr[i] = nextGreater;
            } else {
                while (!st.isEmpty() && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    st.push(arr[i]);
                } else {
                    nextGreater = st.peek();
                    st.push(arr[i]);
                    arr[i] = nextGreater;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
