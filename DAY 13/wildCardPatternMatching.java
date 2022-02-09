import java.util.*;

public class wildCardPatternMatching {

    public static void main(String[] args) {
        // Your Code Here
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String pattern = in.nextLine();
        int R = text.length(); //in row we have the text 
        int C = pattern.length(); //in column we have pattern
        boolean matrix[][] = new boolean[R + 1][C + 1]; //boolean matrix to find the matchin //R+1 and C+1 as we consider index from 1 to R,C as in every dynamic programming
        matrix[0][0] = true; //the first character will always be true
        if (pattern.charAt(0) == '*') { //corner case - when * comes it can match a series of words
            matrix[0][1] = true;
        } 
        for (int row = 1; row <= R; row++) {
            for (int col = 1; col <= C; col++) {
                if (pattern.charAt(col - 1) == '?' || pattern.charAt(col - 1) == text.charAt(row - 1)) { //col-1 as index starts from 1 // after || for character match 
                    matrix[row][col] = matrix[row - 1][col - 1]; //value depens on previous diagonal value 
                } else if (pattern.charAt(col - 1) == '*') {
                    matrix[row][col] = matrix[row - 1][col] || matrix[row][col - 1]; //top cell value || left cell value 
                }
            }
        }
        System.out.println(matrix[R][C] ? "Matching" : "Not matching");
    }
}
