

import java.io.*;

public class Main{

    static boolean arePermutations(int a[], int b[], int n, int m)
    {

        int sum1 = 0, sum2 = 0, mul1 = 1, mul2 = 1;

        for (int i = 0; i < n; i++) {
            sum1 += a[i];
            mul1 *= a[i];
        }

        for (int i = 0; i < m; i++) {
            sum2 += b[i];
            mul2 *= b[i];
        }

        return ((sum1 == sum2) && (mul1 == mul2));
    }


    public static void main (String[] args) {
        int a[] = { 1,2,3,4,5 };
        int b[] = { 5,1,2,3,4};

        int n = a.length;
        int m = b.length;

        if (arePermutations(a, b, n, m)==true)
            System.out.println( "Yes");

        else
            System.out.println( "No");
    }
}
