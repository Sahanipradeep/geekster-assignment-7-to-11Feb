package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System. in);
        System.out.println("Enter the first String:");
        String s1 = in.nextLine();


        System.out.println("Enter the second String:");
                String s2 = in.nextLine();
        if(s1.equals(s2))
            System.out.println("strings are equals");
        else
            System.out.println("strings are not equals");


    }

}