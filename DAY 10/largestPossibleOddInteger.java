import java.util.*;
class largestPossibleOddInteger{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N=in.nextLong();
        int[] digits=new int[10];
        while(N !=0 ){
            digits[(int) (N % 10)]++; //increments the unit value in the digits array
            N /= 10;
        }
        int unitDigit = -1;
        for(int dig = 1; dig < 10; dig += 2){ //loop to check for odd number for the unit digit
         // checking from the beginning of the digits array as to print largest possible odd number so the unit digit can or should be the smallest value
            if(digits[dig] > 0){
                unitDigit = dig;
                digits[unitDigit]--;
                break;
            }
        }
        if(unitDigit == -1){
            System.out.print("no");
            return;
        }
        int start = 1;
        for(int digit = 1; digit <= 9; digit++){ //this loop to avoid leading zeros //starting from 1 to avoid zero as the first value
            if(digits[digit] > 0){
                start = 0;  //after printing the first value we can change the start to 0
                break;
            }
        }
        for(int digit = 9; digit >= start; digit--){ //loop to print the output
            while(digits[digit]-- > 0){  //using post decrement 
                System.out.print(digit);     //can also be coded as digits[digit]--; after the print statement
            }
        }
        System.out.print(unitDigit);
    }
}