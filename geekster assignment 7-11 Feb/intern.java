package com.company;

public class Main {

    public static void main(String[] args) {
	  String str="Pradeep Sahani";
        String str1=new String("Pradeep Sahani");
        System.out.println(str.equals(str1));
        boolean isTrue=str.intern()==str1.intern();
        System.out.println(isTrue);
        boolean isTrue1=str==str1.intern();
        System.out.println(isTrue1);

    }
}
