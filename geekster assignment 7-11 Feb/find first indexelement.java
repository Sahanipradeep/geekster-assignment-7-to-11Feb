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

        System.out.println("Enter elements whose index is to find:");
        int element=s.nextInt();


        for(int i=0;i<arr.length;i++){
            if(arr[i]==element)
                System.out.println("index is:"+i);
            break;
        }

    }

}
