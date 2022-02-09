public class LongestCommonSignal {
    public static void main(String[] args) {
        String str1 = "fever";
        String str2 = "lever";
        int maxlength = 0;
        int[][] matrix = new int[str1.length()][str2.length()];
        for (int row = 0; row < str1.length(); row++) {
            for (int col = 0; col < str2.length(); col++) {
                if (str1.charAt(row) == str2.charAt(col)) {
                    matrix[row][col] = (row == 0 || col == 0) ? 1 : 1 + matrix[row - 1][col - 1];
                    if (matrix[row][col] > maxlength) {
                        maxlength = matrix[row][col];
                    }
                }
            }
        }
        System.out.println(maxlength);
    }
}
