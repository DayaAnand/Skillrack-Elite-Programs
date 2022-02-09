import java.util.*;

public class minimumJumpsToReachEnd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if (N == 1) { //if there is only one stone no jump is required
            System.out.println(0);
            return;
        }
        int arr[] = new int[N];
        for (int index = 0; index < N; index++) {
            arr[index] = s.nextInt();
        }
        int jumps = 1;
        int maxReachIndex = arr[0];
        int steps = arr[0];

        for (int index = 1; index < N; index++) { //refer logic photo
            if (index == N - 1) {
                break;
            }
            if (index + arr[index] > maxReachIndex) {
                maxReachIndex = index + arr[index];
            }
            steps--;
            if (steps == 0) {
                jumps++;
                steps = maxReachIndex - index;
            }
        }
        System.out.println(jumps);
    }
}