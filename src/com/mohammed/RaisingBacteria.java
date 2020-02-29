package com.mohammed;

import java.util.Arrays;
import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;
        while (x > 0) {
            if (x % 2 == 1)
                count++;
            x /= 2;
        }
        scanner.close();
        System.out.println(count);
    }
}
