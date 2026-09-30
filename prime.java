import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = false;
        for(int i =2; i< n-1; i++){  
            //checking third factor other than 1 and self.
            if(n%i==0){
                check = true;
                break;
            }
            
        }
        if(check == true){
            System.out.println("Not prime");
        }else{
            System.out.println("YES, its prime");
        }

        sc.close();
        
    }
}
