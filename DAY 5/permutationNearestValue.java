public class permutationNearestValue {
    static int closest, x;

    private static void permute(char[] str, int left, int right) {
        if (left == right) {
            int curr = Integer.parseInt(new String(str));
            if (absDiff(x, curr) < absDiff(x, closest)) {
                closest = curr;
            }
            return;
        }
        for (int index = left; index <= right; index++) {
            swap(str, left, index);
            permute(str, left + 1, right);
            swap(str, left, index);
        }
    }

    private static void swap(char[] str, int x, int y) {
        char temp = str[x];
        str[x] = str[y];
        str[y] = temp;
    }

    private static int absDiff(int a, int b) {
        return a > b ? a - b : b - a;
    }

    public static void main(String[] args) {
        String cc = "123";
        char str[] = cc.toCharArray();
        int len = str.length;
        x = 200;
        closest = Integer.parseInt(cc);
        permute(str, 0, len - 1);
        System.out.println(closest);
    }

}
