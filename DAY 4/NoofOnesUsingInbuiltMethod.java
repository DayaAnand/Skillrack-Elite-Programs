public class NoofOnesUsingInbuiltMethod {
    public static void main(String[] args) {

        int n = 15;
        String ans = Integer.toBinaryString(n);
        System.out.println(ans);
        int tow = Integer.parseInt(ans);
        System.out.println("two" + tow);
        int one = Integer.bitCount(n);
        System.out.println(one);
    }
}
