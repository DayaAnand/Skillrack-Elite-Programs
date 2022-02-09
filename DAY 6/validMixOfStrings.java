import java.util.*;
public class validMixOfStrings {

    private static boolean isValidMix(String str1,String str2,String mix, int index1, int index2, int mixIndex){
        while(mixIndex<mix.length()){
            if(index1<str1.length() && index2<str2.length() && str1.charAt(index1)==mix.charAt(mixIndex) 
                            && str2.charAt(index2)== mix.charAt(mixIndex) ){ //when same char at both str1 and str2 so using backtracking
                if(isValidMix(str1,str2,mix,index1+1,index2,mixIndex+1)){   //backtrack
                    return true;
                }
                else{
                    return isValidMix(str1,str2,mix,index1,index2+1,mixIndex+1);    //backtrack
                }
            }
            else if(index1<str1.length()&& str1.charAt(index1) == mix.charAt(mixIndex) ){
                index1++;
                mixIndex++;
            }
            else if(index2<str2.length()&& str2.charAt(index2) == mix.charAt(mixIndex) ){
                index2++;
                mixIndex++; 
            }
            else{
                return false;
            }
        }
        return true;
    } 
    
    public static void main(String[] args) {
		//Your Code Here
        Scanner in=new Scanner(System.in);
        String str1 = in.nextLine();    
        String str2 = in.nextLine();    
        String mix = in.nextLine();    
        int index1=0,index2=0,mixIndex=0;
        if(str1.length()+str2.length()!=mix.length()){
            System.out.println("NO"); return;
        }
        if(isValidMix(str1,str2,mix,index1,index2,mixIndex)){
            System.out.println("YES"); 
        }
        else{
            System.out.println("NO"); 
        }
	}
}