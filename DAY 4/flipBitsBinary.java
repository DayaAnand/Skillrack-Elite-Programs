import java.util.*;

public class flipBitsBinary {
        public static void main(String[] args) {
            //Your Code Here
            Scanner in =new Scanner(System.in);
            int A=in.nextInt(),B=in.nextInt();
            int C = A^B, flipBits=0;
            while(C!=0){
                flipBits+=C&1;
                C=C/2;
            }
            System.out.println(flipBits);
        }
    }