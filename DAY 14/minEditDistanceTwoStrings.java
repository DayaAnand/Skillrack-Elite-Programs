import java.util.*;

public class minEditDistanceTwoStrings {

    public static void main(String[] args) {
        // Your Code Here
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int R = str1.length();
        int C = str2.length();

        int matrix[][] = new int[R + 1][C + 1]; 
        for (int row = 1; row <= R; row++) { //filling the row values
            matrix[row][0] = row;
        }
        for (int col = 0; col <= C; col++) { //filling the col values
            matrix[0][col] = col;
        }
        for (int row = 1; row <= R; row++) {
            for (int col = 1; col <= C; col++) {
                if (str1.charAt(row - 1) == str2.charAt(col - 1)) { //refer the logic photo
                    matrix[row][col] = matrix[row - 1][col - 1];
                } else {
                    int top = matrix[row - 1][col];
                    int topleft = matrix[row - 1][col - 1];
                    int left = matrix[row][col - 1];
                    matrix[row][col] = Math.min(left, (Math.min(top, topleft))) + 1; //adding one refer photo
                }
            }
        }
        System.out.println(matrix[R][C]);
    }
}