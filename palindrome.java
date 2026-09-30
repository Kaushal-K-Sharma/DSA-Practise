import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // input
        int n = sc.nextInt();
        int rev = 0;
        int temp = 0;
        int b = n;

        while(n>0){
            temp = n%10;
            rev = rev*10 + temp;
            n/=10;
        }

        System.out.println("Number :"+b);
        System.out.println("Reversed :"+rev);

        if(rev == b){
            System.out.println("Palindrome");

        }else{System.out.println("Not palindrome");}

        sc.close();
    }
}
