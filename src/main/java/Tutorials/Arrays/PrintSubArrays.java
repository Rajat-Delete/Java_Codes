package Tutorials.Arrays;

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
            for(int j=i+1;j<arr.length;j++){
                printArray(arr,i,j);
            }
        }
    }
}
