import java.util.Scanner;
public class cf546A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // price of first banana
        int n = sc.nextInt(); // money he haas
        int w = sc.nextInt(); // banana he wants
        int output = 0;
        for(int i=1; i<=w; i++){
            output += i*k;
        }
        
        if(output - n <= 0){
            System.out.println(0);
        }else if(output - n > 0){
            System.out.println(output - n);
        }

        sc.close();        
        
        

    }
}
