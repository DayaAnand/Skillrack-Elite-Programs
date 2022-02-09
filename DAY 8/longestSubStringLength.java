import java.util.*;
public class longestSubStringLength { //1st test case not working checkf
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        int K=in.nextInt();
        int start=0,end=0,unique=0,max=0;
        int len=str.length()-1; //check here --maybe not checking the full string print the length and check
        int arr[] = new int[128];
        arr[str.charAt(end)]=1; //assigning the first element of the arr to be one as end is pointing at 0
        unique=1; //assigning unique as one as the string first element is poiting to one
        while(end<len){
            if(K==unique){
                int curr=end-start+1; //finding the longest substring
                if(curr>max){
                    max=curr;
                }
            }
            if(unique<=K){
                end++;
                arr[str.charAt(end)]++;
                if(arr[str.charAt(end)]==1){ //increment unique only when the hashed array value is one
                    unique++; 
                }
            }else{
                arr[str.charAt(start)]--;
                if(arr[str.charAt(start)]==0){
                    unique--;
                }
                start++;
            }
        }
        System.out.println(max);
    }
}
