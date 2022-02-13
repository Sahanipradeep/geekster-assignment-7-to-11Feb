package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         int temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements of array:");
        int n=s.nextInt();
        System.out.println("Enter elements of array");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]+" ");
      }

    }

}
