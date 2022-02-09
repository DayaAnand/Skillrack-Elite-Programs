import java.util.*;
public class decodeWays {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in= new Scanner(System.in);
        String str=in.nextLine();
        int ways=1,prevWays=1;
        if(str.charAt(str.length()-1)=='0'){
            ways=0;
        }
        for(int index=str.length()-2;index>=0;index--){ 
            int backup=prevWays;
            prevWays=ways;
            if(str.charAt(index)=='0'){
                ways=0;
                continue;
            }
            int twoDigitValue=Integer.parseInt(str.substring(index,index+2));
            if(twoDigitValue<=26){
                ways+=backup;
            }
        }
        System.out.println(ways);
	}
}