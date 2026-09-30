import java.util.Scanner;
public class array3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print array: ");
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        int max = 0;
        //  max
        for(int i = 0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("\nMaximum Element : " + max);


        // ========================

         int min = arr[0];
        // min 
        for(int i = 0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        
        System.out.println("\nMinimum Element : " + min);


        // can also be done by 
        // Arrays.sort(arr);
        // min is arr[0]
        // max is arr[n-1], where n is size of array
        

        sc.close();
    }
}