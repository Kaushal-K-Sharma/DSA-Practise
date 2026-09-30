//import java.util.Arrays;
public class arraysecond {
    public static void main(String[] args) {
        // int[] arr = {3, 5, 6, 7, 9, 10};
        // // find the second largest element
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-2]);


        // SECOND LARGEST ELEMENT OF AN ARRAY

        int[] arr = {20, 30, 1, 40, 50, 8};
        int largest = Integer.MIN_VALUE;
        int sclargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                sclargest = largest;
                largest = arr[i];
            }else if ((arr[i] > sclargest) && (arr[i] != largest)){
                sclargest = arr[i];
            }
        }

        System.out.println("Second largest: " + sclargest);
        // two sum solve leetcode
        // move zeros to the end


    }

}
