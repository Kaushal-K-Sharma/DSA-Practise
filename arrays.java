import java.util.Scanner;
public class arrays {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Input: ");
        for(int i =0; i<5; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Output array: ");
        for(int i =0; i<5; i++){
            System.out.print(arr[i] + " ");

        }

        System.out.println("\n==============");
        System.out.println("Array Length" + arr.length);
        System.out.println(arr);

        sc.close();
    }
}
