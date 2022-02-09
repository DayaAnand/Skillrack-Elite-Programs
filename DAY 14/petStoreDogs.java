import java.util.*;
import java.math.*;

public class petStoreDogs {

    public static void main(String[] args) {
        // Your Code Here
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        BigInteger ways[] = new BigInteger[N + 1];
        for (int ctr = 1; ctr <= N; ctr++) {
            if (ctr <= 2) { // for first two we have to initialize the value as it will throw
                            // IndexOutOfBoundException
                ways[ctr] = new BigInteger(ctr + "");
            } else {
                BigInteger passive = new BigInteger((ctr - 1) + "").multiply(ways[ctr - 2]); // refer logic photo
                ways[ctr] = passive.add(ways[ctr - 1]);
            }
        }
        System.out.println(ways[N].toString());
    }
}