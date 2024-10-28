package Tutorials.Arrays;

public class PassByReference_Arrays {

    public static void update(int arr[], int var){
        //iterating every element of the array and increasing it by one
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]+1;
        }
        var = 20;
    }

    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int nonchangable = 10;
        update(marks,nonchangable);
        System.out.println(nonchangable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
