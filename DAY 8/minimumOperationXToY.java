import java.util.*;
public class minimumOperationXToY {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int count=0;
        while(y>x){
            if(y%2!=0){
                y=y+1;
            }
            else{
                y=y/2;
            }
            count++;
        } 
        count=count+(x-y); //when the while loop exists then x>y so only operation to be done is x-y added with count
        System.out.println(count);
	}
}
