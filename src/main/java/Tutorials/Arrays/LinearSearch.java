package Tutorials.Arrays;

public class LinearSearch {

    public static int findIndex(int[] arr, int key){
        //iterate over the passed array and find the index
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int findbreakfastIndex(String[] arr, String key){
        //iterate over the passed array and find the index
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //finding a key from the list of element in the Array
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        String breakfastarr[] = {"kachori","Dosa","Vada","idly"};
        System.out.println(findbreakfastIndex(breakfastarr,"idly"));
        if(findIndex(arr,10) != -1){
            System.out.println("Key found at Index "+findIndex(arr,10));
        }else{
            System.out.println("Key not found");
        }
    }
}
