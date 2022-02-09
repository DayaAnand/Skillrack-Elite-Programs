import java.util.*;
public class maxCoins {

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt(); //Testcase
		while(T-- > 0){
		    int R = s.nextInt(), C = s.nextInt();
		    int matrix[][] = new int[R][C];
		    for(int row = 0; row < R; row++){
		        for(int col = 0; col < C; col++){
		            matrix[row][col] = s.nextInt();
		        }
		    }
		    int dp[][] = new int[R][C];
		    for(int col = 0; col < C; col++){ //filling the first row in dp matrix
		        dp[0][col] = matrix[0][col];
		    }

		    for(int row = 1; row < R; row++){ 
		        int prevRow[] = Arrays.copyOf(dp[row - 1], C); // C - denotes the size of the copied matrix //row-1 since index starts from 1
		        Arrays.sort(prevRow); //taking a copy of the first row of the original matrix for sorting and finding the maximum value
		        int firstMax = prevRow[C - 1];
		        int secondMax = prevRow[C - 2];
		        for(int col = 0; col < C; col++){  
		            if(dp[row - 1][col] != firstMax){
		                dp[row][col] = firstMax + matrix[row][col];
		            }
		            else{
		                dp[row][col] = secondMax + matrix[row][col];
		            }
		        }
		    }
		    Arrays.sort(dp[R - 1]); //sorting the last row of the dp matrix
		    System.out.println(dp[R - 1][C - 1]); //printing the last value of the dp matrix
		}
		
	
    }
}
