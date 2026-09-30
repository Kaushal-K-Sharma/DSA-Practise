import java.util.Scanner;
public class cf160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        int take =0;
        int temp = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        // System.out.println(sum);

        // for(int i=0; i<n; i++){
        //     temp += arr[i];
        //     take++;
        //     if(temp > sum/2 ){
        //         break;
        //     }
        // }

        // arrays.sort , rev loop, mysum +=coins[i], coins++, if(mysum > total-mysum), break;  sout(coins)

        System.out.println(take);

        // seoncd method
        // we can sort the array and then take the
        // largest elements until we reach more than half of the sum
        // and check the total and remaining.


        sc.close();
        

    }
}
