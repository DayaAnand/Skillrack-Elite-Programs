import java.util.Scanner;

public class vowelsSlidingWindow {
    public static boolean isVowel(Character ch){

        char ch1 =Character.toLowerCase(ch);
        if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int windowSize=in.nextInt();;
        String str=in.next();
        int n=str.length();
        int vowelCount=0;
        for(int i=0;i<windowSize;i++){
            if(isVowel(str.charAt(i))){
                vowelCount++;
            }
        }
        System.out.print(vowelCount+" ");
        for(int i=1;i<=n-windowSize;i++){
            if(isVowel(str.charAt(i-1))){
                vowelCount--;
            }
            if(isVowel(str.charAt(i+windowSize-1))){
                vowelCount++;
            }
            System.out.print(vowelCount+" ");
        }
    }
}
