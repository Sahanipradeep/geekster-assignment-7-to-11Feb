package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str2="";
        System.out.println("Enter the string:");
	Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    for(int i=str.length()-1;i>=0;i--)
    {
        str2=str2+str.charAt(i);
    }
        System.out.println("reverse of stringis:"+str2);

    }
}
