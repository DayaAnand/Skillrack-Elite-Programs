import java.util.Scanner;

public class findHCFEuclideanAlgo {
    private static int findHCF(int a, int b) {
        return b==0?a:findHCF(b, a%b);
    }
    public static void main(String[] args) {
        int N = 4;
        Scanner in = new Scanner(System.in);
        int hcf = in.nextInt();
        for (int ctr = 2; ctr <= N; ctr++) {
            int currNum = in.nextInt(); 
            hcf = findHCF(hcf, currNum);
        }
        System.out.println(hcf
        );
    }
}