package Tutorials.Arrays;

//Given a Array find all the possible pairs


public class PairsInArray  {
    public static void main(String[] args) {
        int arr[] = {12,3,4,56,78,9,0};

        for(int i=0;i<arr.length;i++){
            for(int k = i+1;k<arr.length;k++){
                System.out.print(arr[i]+" "+arr[k]+"   ");
            }
            System.out.println("");
        }
    }
}
