import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int temp = 0;
        int sum = 0;
        while(n>0){
            temp = n%10; // to get last digit
            sum = sum + temp;
            n /= 10; // to remove last digit
        }

        System.out.println(sum);

        sc.close();
    }
}
