package com.mohammed;

import java.util.ArrayList;
import java.util.Scanner;

public class Isolation {

    static int factorial(int x) {
        int factorial = 1;
        while (x > 0) {
            factorial *= x;
            x--;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int factorial = factorial(n);
        ArrayList[] lists = new ArrayList[factorial];
        for (int i = 0; i < factorial; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = n; l > 0; l--) {

                }
                lists[i] = new ArrayList<ArrayList<Integer>>();
            }
        }
    }
}
