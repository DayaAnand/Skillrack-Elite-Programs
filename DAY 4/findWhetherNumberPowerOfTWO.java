import java.util.Scanner;

public class findWhetherNumberPowerOfTWO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        System.out.println((N&(N-1)) ==0 ? "Yes, the given number is a power of two(2)":"No, The given number is not the power of two(2)");
    }
}
