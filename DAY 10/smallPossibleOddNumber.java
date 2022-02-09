import java.util.Scanner;

public class smallPossibleOddNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N=in.nextLong();
        int[] digits=new int[10];
        while(N !=0 ){
            digits[(int) (N % 10)]++; //increments the unit value in the digits array
            N /= 10;
        }
        int unitDigit = -1;
        for(int dig=9;dig>=1;dig-=2){
            if(digits[dig]>0){ //loop to check for odd number for the unit digit
                               // checking from the last of the digits array as to print smallest possible odd number so the unit digit can or should he the highest value
                unitDigit=dig;
                digits[dig]--;
                break;
            }
        }
        if(unitDigit==-1){
           System.out.print("no");
            return;
        }
        
        int start=1;
        for(int digit=1;digit<=9;digit++){ //this loop to avoid leading zeros   //starting from 1 to avoid zero as the first value
            if(digits[digit]>0){
                System.out.print(digit);
                digits[digit]--;
                start=0;    //after printing the first value we can change the start to 0
                break;
            }
        }
        for(int digit=start ;digit<=9;digit++){ //loop to print the output
            while(digits[digit]-->0){ //using post decrement //can also be coded as digits[digit]--; after the print statement
                System.out.print(digit);
            }
        }
        System.out.print(unitDigit);
    }
}
