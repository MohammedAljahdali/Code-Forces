package com.mohammed;

import java.util.ArrayList;
import java.util.Scanner;

public class FlippingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] board = new int[n];
        for (int i = 0; i < n; i++) {
            board[i] = scanner.nextInt();
            if (n == 1 && board[i] == 1) {
                System.out.println(0);
                return;
            }
        }
        int countOnes = 0;
        ArrayList<Integer> numberOfZeros = new ArrayList<>();
        numberOfZeros.add(0);
        for (int i = 0, j = 0; i < n; i++) {
            if (board[i] == 1) {
                j++;
                numberOfZeros.add(0);
                countOnes++;
            }
            if (board[i] == 0) {
                numberOfZeros.add(j, 1+numberOfZeros.get(j));
            }
        }
        if (countOnes == n) {
            System.out.println(countOnes-1);
            return;
        }
        int maxZeros = 0;
        for (int a: numberOfZeros) {
            if (a > maxZeros)
                maxZeros = a;
        }
        System.out.println(maxZeros+countOnes);
    }
}
