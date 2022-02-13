package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements of array:");
        int n=s.nextInt();
        System.out.println("Enter elements of array");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(" array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(" array reverse elements:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }


    }

}
