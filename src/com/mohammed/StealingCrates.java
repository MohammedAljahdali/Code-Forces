package com.mohammed;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class StealingCrates {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("Data"));
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int grid[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int[] maxR = new int[row];
        int[] maxC = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] > maxR[i])
                    maxR[i] = grid[i][j];
                else if (grid[i][j] > maxC[j])
                    maxC[j] = grid[i][j];

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (maxC[j] == maxR[i])
                    maxC[j] = 0;
            }
        }
        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] > 1)
                    total += grid[i][j] - 1;
            }
        }
        for (int i = 0; i < col; i++) {
            if (maxC[i] > 1)
                total -= maxC[i] - 1;
        }
        for (int i = 0; i < row; i++) {
            if (maxR[i] > 1)
                total -= maxR[i] - 1;
        }
        System.out.println(total);


    }
}
