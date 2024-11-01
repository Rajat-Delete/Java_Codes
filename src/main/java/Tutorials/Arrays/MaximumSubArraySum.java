package Tutorials.Arrays;

//Brute force Approach is to find all the possible combinations and check if the sum is greater or not
//Space Complexity is O(n^3)

public class MaximumSubArraySum {
    public static void findMaxSum(int[] arr){

        int maxSum = Integer.MIN_VALUE;

        //go from start to the end of the array and find all the possible combinations of SubArrays
        for(int start=0;start<arr.length;start++){
            for(int end = start;end < arr.length;end++){
                int sum=0;
                for(int i=start;i<=end;i++){
                    //System.out.print(arr[i]+" ");
                    sum = sum + arr[i];
                }
                //System.out.println("sum is "+sum);
                if(sum > maxSum){
                    maxSum = sum;
                }
                //System.out.println(" ");
            }
        }
        System.out.println("Max sum is "+maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {12,3,4,56,78,9,0};
        //start from the ith Index and take it from start to end
        findMaxSum(arr);
    }
}
