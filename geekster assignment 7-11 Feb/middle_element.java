package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements of array");
        
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();
        }

        System.out.println(" middle element of an array:"+arr[5]);

    }

}
