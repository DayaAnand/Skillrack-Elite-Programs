import java.util.*;
public class Hello {
    public static int near_val;
    public static int ans;

    public static void swap(char text[] ,int left ,int right){
        char temp = text[left];
        text[left] = text[right];
        text[right] = temp;
    }
    
    public static void permute(char text[] ,int left ,int right){
        if(left == right){
            int NUM = Integer.parseInt(String.valueOf(text));
            if(Math.abs(near_val-NUM) < Math.abs(near_val-ans)){
                ans = NUM;
            }
            return;
        }
        for(int index=left;index<=right;index++){
            swap(text,left,index);
            permute(text,left+1,right);
            swap(text,left,index);
        }
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner ip = new Scanner(System.in);
		String[] inputs = ip.nextLine().split(" ");
	//	System.out.print(inputs[0]+" "+inputs[1]);
		int near_val = Integer.valueOf(inputs[1]);
		String number_ip = inputs[0];
        permute(number_ip.toCharArray() , 0 , number_ip.length()-1);
        System.out.print(ans);
	}
}