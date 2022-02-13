package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements of array");

        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();
            if(arr[i]>0)
                System.out.println(" positive element of an array:"+arr[i]);


        }



    }

}
