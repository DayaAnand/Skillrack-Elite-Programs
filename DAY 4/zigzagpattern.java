import java.util.*;
public class zigzagpattern {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		for(int row=1;row<=N;row++){
		    int val=row,dir=-1,down=(N-row)*2+1,up=(row-1)*2+1;
		    for(int col=1;col<=N;col++){
		        System.out.print(val+" ");
		        if(dir==-1){
		            val+=down;
		        }
		        else{
		            val+=up;
		        }
		        dir*=-1;
		    }
		    System.out.println();
		}
	}
}