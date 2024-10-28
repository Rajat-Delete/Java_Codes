package Tutorials.Arrays;

public class LargestInArray {

    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i] > largest){
               largest = arr[i];
           }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {10,2,44,5665,56,98,923,12,434,22,76};
        System.out.println(findLargest(arr));
    }
}
