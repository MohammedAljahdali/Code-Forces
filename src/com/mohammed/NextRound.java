package com.mohammed;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int k = scanner.nextInt();
        int[] contestant = new int[n];
        for (int i = 0; i < n; i++) {
            contestant[i] = scanner.nextInt();
        }
        int kthScore = contestant[k-1];
        int winners = 0;
        if (kthScore == 0) {
            for (int i = 0; i < n; i++) {
                if (contestant[i] > 0)
                    winners++;
            }
        } else
            for (int i = n-1; i >= 0; i--) {
                if (contestant[i] == kthScore) {
                    winners = i+1;
                    break;
                }
            }
        System.out.println(winners);
    }
}
