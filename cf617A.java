import java.util.Scanner;
public class cf617A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        while(x > 0){
            if(x >=5){
                x-=5;
                count+=1;
            }else if(x >=4){
                x-=4;
                count+=1;
            }else if(x >=3){
                x-=3;
                count+=1;
            }else if(x >=2){
                x-=2;
                count+=1;
            }else if(x >=1){
                x-=1;
                count+=1;
            }
            
        }
        System.out.println(count);
        sc.close();
    }
}