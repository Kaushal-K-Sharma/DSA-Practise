// Question 1: Lucky Digit Counter

// Rohan enters a positive integer N. Count how many digits in the number are equal to 7.

// Input
// 274757

// Output
// 3
import java.util.Scanner;
public class countdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = 0;

        do{
            temp = n%10;
            if(temp == 7){
                count+=1;
            }
            n/=10;
        }
        while(n>0);

        System.out.println("Count: "+count);

        sc.close();
    }
}
