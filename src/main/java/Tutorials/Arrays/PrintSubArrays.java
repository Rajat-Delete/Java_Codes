package Tutorials.Arrays;

//Print all the possible subarrays of the Array

public class PrintSubArrays {


    public static void printArray(int arr[], int start, int end){
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[] = {12,3,4,56,78,9,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                printArray(arr,i,j);
            }
            System.out.println(" ");
        }
    }
}
