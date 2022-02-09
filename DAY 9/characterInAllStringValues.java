import java.util.*;
public class characterInAllStringValues {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		in.nextLine();
		int asciiCount[]=new int[128];
		for(int index=0;index<N;index++){
			String str=in.nextLine().trim();
			for(int chindex=0;chindex<=str.length()-1;chindex++){ //loops until the null character is found in the string
				char ch= str.charAt(chindex);
				if(asciiCount[ch]==index){ //this condition is to avoid duplicate value incremented
					asciiCount[ch]++;
				}
			}
		}
		for(int ascii=1;ascii<128;ascii++){
			if(asciiCount[ascii]==N){ //printing only when the count is equal to N
				System.out.print((char)ascii);
			}
		} 
	}
}