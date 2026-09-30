import java.util.Scanner;
public class cf791A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int output = 0;
        while(a <= b){
            a = a * 3;
            b = b * 2;
            output++;
        }
        System.out.println(output);

        sc.close();
    }

}