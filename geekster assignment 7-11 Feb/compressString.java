package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str2="";
        System.out.println("Enter the string:");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str2=str.replaceAll(" ","");
        System.out.println(str2);

    }
}
