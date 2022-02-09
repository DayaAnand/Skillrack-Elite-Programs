import java.util.*;

public class sudokuValidity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R=9,C=9;
        int[] rflags = new int[R]; //rflags to check for unique elements from 1-9 //same cflags for column // smflags for sub matrix
        int[] cflags = new int[R];
        int[] smflags = new int[R];
        for(int index=0;index<9;index++){
            rflags[index]=cflags[index]=smflags[index]=1;
        }
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                int digit=in.nextInt();
                rflags[row] |= (1<<digit);
                cflags[col] |= (1<<digit);
                smflags[(row/3)*3+col/3] |= (1<<digit); // fomula for sub matrix (row/3)*3+col/3 when row = 3
            }
        }
        int val=(1<<10)-1; //10000000000 - 1 so nine ones will be there
        for(int index=0;index<9;index++){
            if(rflags[index]!=val || cflags[index]!=val || smflags[index]!=val){
                System.out.println("INVALID");
                return;
            }
        }
        System.out.println("VALID");
    }
}
