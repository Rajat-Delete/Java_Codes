package Tutorials.Arrays;

public class BinarySearch {

    public static int doBinarySearch(int arr[], int key){
        //Implementing Binary Search
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //calculating the mid
            int mid = (start+end)/2;
            if(key<arr[mid]){
                end = mid;
            }else if(key > arr[mid]){
                start = mid;
            }else if(key == arr[mid]){
                System.out.println("Key found at "+mid);
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int key = 60;
        int foundIndex =doBinarySearch(arr,key);
        if(foundIndex != -1){
            System.out.println("Element found at Index "+foundIndex);
        }else{
            System.out.println("Element not found in the Array");
        }
    }
}
