import java.util.*;
public class majorityElement {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		
		int[] arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=in.nextInt();
		}
		int counter=1,majorityElement=arr[0];
       // int flag=0;
        for(int i=0;i<N;i++){
            if(majorityElement==arr[i]){
                counter++;
            }
            else{
                counter--;
                if(counter ==0){
                    majorityElement=arr[i];
                    counter=1;
                }
            }
        }
        if(counter>0){
            int actualCount=0;
            for(int i=0;i<N;i++){
                if(arr[i]==majorityElement){
                    actualCount++;
                }
            }
            if(actualCount>N/2){
                System.out.println(majorityElement);
                return; //here return
                //flag=1;
            }
        }
        // if(flag==0){
        //     System.out.println("No Majority Element"); // both commented and return works
        // }
        System.out.println("No Majority Element");
	}
}