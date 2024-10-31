package Tutorials.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //we will use 2 pointer approach here
        //will start 2 pointer at start and end of the array and swap until they overlap
        int arr[] = {12,3,4,56,78,9,0};
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int a : arr){
            System.out.print(a+" ");
        }
     }
}
