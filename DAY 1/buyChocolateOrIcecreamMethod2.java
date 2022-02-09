import java.util.Scanner;

public class buyChocolateOrIcecreamMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long choc=1, ice=1;long total=0;
        
        for(int i=2;i<=n;i++){
            total =choc+ice;
            ice=choc;
            choc=total;
        }
        System.out.println(ice+choc);
    }
}
