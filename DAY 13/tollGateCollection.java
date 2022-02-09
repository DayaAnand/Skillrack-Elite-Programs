import java.util.*;

public class tollGateCollection {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int D = s.nextInt() + 1; //since we have to check from that km eg:if 50 we have to check from 51th km
        int K = s.nextInt();
        int tollGates[] = new int[K];
        int fee[] = new int[K];
        for (int index = 0; index < K; index++) {
            tollGates[index] = s.nextInt();
        }
        for (int index = 0; index < K; index++) {
            fee[index] = s.nextInt();
        }
        int gateIndex = 0;
        int kilometer[] = new int[N + 1];
        for (int index = 1; index <= N; index++) {
            if (index == tollGates[gateIndex]) {
                int curr = fee[gateIndex];
                if ((index - D) > 0) {
                    curr += kilometer[index - D];
                }
                kilometer[index] = Math.max(curr, kilometer[index - 1]);
                gateIndex++;
            } else {
                kilometer[index] = kilometer[index - 1];
            }
            if (gateIndex == K) {
                System.out.println(kilometer[index]);
                break;
            }
        }
    }
}
