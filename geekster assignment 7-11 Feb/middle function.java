package com.company;

public class Main {


	public static int[] Middle(int[] arr){

        int[] newlist=new int[arr.length-2];
        for(int i=1; i<arr.length-2;i++){
         int  newarr[i-1]=arr[i];
        }
        return newarr;
        }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Middle( arr));
    }
}
