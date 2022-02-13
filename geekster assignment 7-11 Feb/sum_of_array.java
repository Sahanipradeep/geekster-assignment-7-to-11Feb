package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements of array");
        int sum=0;
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<10;i++){
            sum=sum+arr[i];
        }
        System.out.println(" sum of elements of array:"+sum);
    }

}
