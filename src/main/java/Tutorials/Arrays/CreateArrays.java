package Tutorials.Arrays;

import java.util.Scanner;

public class CreateArrays {

    public static void main(String[] args) {
        int marks[] = new int[50];
        int numbers[] = {1,2,3};
        int moreNumbers[] = {4,5,6};
        String fruits[] = {"Apple","Banana","Carrot"};

        //Taking 3 numbers input from user
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phys : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);

        //calculating percentage from the numbers
        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage of the Student is "+percentage+"%");


        //calculating the length of the array
        System.out.println("The Length of marks Array is "+marks.length);
    }
}
