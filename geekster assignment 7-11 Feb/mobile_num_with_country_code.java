package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         code( int mobile_num);
        System.out.println(code( int mobile_num));
    }
	public static void code(int n){
        Scanner s=new Scanner(System.in);
        int mobile_num=s.nextInt();
        String num_with_code="+91-"+mobile_num;
        }

}
