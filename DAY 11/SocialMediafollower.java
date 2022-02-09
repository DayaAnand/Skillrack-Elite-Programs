import java.util.*;
public class SocialMediafollower {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int R=in.nextInt();
        int arr[] = new int[N+1];
        int follower,personFollowed;
        for(int ctr=0;ctr<R;ctr++){
            follower=in.nextInt();
            personFollowed=in.nextInt();
            arr[follower]--;        //decrementing the follower count by 1
            arr[personFollowed]++;  //increasind the person followed count by 1
        }
        // int leader=-1; alternate
        for(int index=1;index<=N;index++){
            if(arr[index] == N-1){  //checking if the personFollowed count is equal to 4 when N is 5
                System.out.println(index);
                // leader=index;
                return;
            }
        }
        System.out.println("-1");
	}
}