public class icecreamKthdayMethod2 {
    public static void main(String[] args) {
        int n = 3, k = 2;
        int choc = 1, ice = 1;
        int total = 0;
        for (int i = 2; i <= n; i++) {
            total = choc + ice;
            int prev = ice; //storing the previous state of the ice for adding on the Kth day
            ice = choc;
            choc = total;
            if (i % k == 0) {
                ice += prev;
            }
        }
        System.out.println(ice + choc);
    }
}
