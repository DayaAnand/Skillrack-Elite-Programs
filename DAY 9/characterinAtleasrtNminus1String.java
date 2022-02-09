import java.util.*;
public class characterinAtleasrtNminus1String { //refer C code also

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        
        int[] arr=new int[128];
        for(int i=0;i<N;i++)
        {
            String words=sc.nextLine().trim();
            int []currCount=new int[128]; //this array is for a specific string 
            for(int index=0;index<words.length();index++)
            {
                if(currCount[words.charAt(index)]==0 && arr[words.charAt(index)]>=i-1)
                {
                    //currCount==0 to avoid duplicate charcters // This can also be coded as >=index-1 (for ==index || ==index-1)
                    arr[words.charAt(index)]+=1;
                    currCount[words.charAt(index)]++;
                }
            }
        }
        for(int i=0;i<128;i++)
        {
            if(arr[i]>=N-1) //this can also be coded as N>=-1 (for ==N || ==N-1)
            {
                System.out.print((char)i);
            }
        }

    }
}
