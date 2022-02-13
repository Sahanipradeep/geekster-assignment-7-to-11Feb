package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "Geekster-The%school:where+you@code:your-success$stories";
        String str2 = str.replaceAll("[-%:+@$]", " ");

        System.out.println(str2);
    }
}
