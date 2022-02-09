import java.util.*;
public class SellingWineBottles {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int prices[]=new int[N];
        for(int index=0;index<N;index++){
            prices[index]=in.nextInt();
        }
        int max[][] =new int[N][N]; //memosation array
        System.out.println(maxRevenue(prices,max,0,N-1,1));
	}
	
	private static int maxRevenue(int[] prices,int[][] max,int left,int right,int year){
	    if(max[left][right]!=0){
	        return max[left][right];
	    }
	    if(left==right){  //base condition for recursion
	        return prices[left]*year; //left can also be coded as right since when one element is present in the array left==right
	    }
	    
	    int leftRevenue=prices[left]*year+maxRevenue(prices,max,left+1,right,year+1); //left+1 since already calculated left element
	    
	    int rightRevenue=prices[right]*year+maxRevenue(prices,max,left,right-1,year+1); //right-1 since already calculated right element
	    
	    max[left][right]=Math.max(leftRevenue,rightRevenue);
	    return max[left][right];
	}
}
