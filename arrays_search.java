// import java.util.Scanner;

public class arrays_search {
    public  static void main(String[] args){
        
        int[] arr = {10, 20 , 30 , 40, 50};
        int target = 25;
        int a = 0;
        
        System.out.println("\n==============");

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                a = 1;
                break;
            }else{a = 0;}
        }

        

        if(a==1){
            System.out.println("Target found");
        }else{
            System.out.println("Target not found");
        }

        System.out.println("\n==============");
      

        
    }

}
