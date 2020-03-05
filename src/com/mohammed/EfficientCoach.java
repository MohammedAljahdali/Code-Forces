package com.mohammed;

import java.util.*;

public class EfficientCoach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        while (tests-- > 0) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            double[][] grid = new double[rows][cols];
            final int capacity = scanner.nextInt();
            int stations = scanner.nextInt();
            for (int i = 0; i < stations; i++) {
                grid[scanner.nextInt()-1][scanner.nextInt()-1] = scanner.nextDouble();
            }
            for (int i = 0; i < grid.length; i++) {
                System.out.println(Arrays.toString(grid[i]));
            }
            // add costs to this after they reach the goal
            ArrayList<Double> costs = new ArrayList<>();
            // row col cost gas
            double[] initialsPos = {0, 0, 0, capacity};
            Stack<double[]> positions = new Stack<>();
            positions.add(initialsPos);
            int row = 0;
            int col = 0;
            double cost = 0;
            double tank = 0;
            while (!positions.isEmpty()) {
                double[] person = positions.pop();
                // move down
                if (person[0] < rows - 1 && person[3] > 0) {
                    // changing the position and adding the cost and reducing the gas
                    row = (int)person[0] + 1;
                    col = (int)person[1];
                    cost = person[2];
                    tank = person[3] - 1;
                    if (grid[row][col] != 0) {
                        cost += grid[row][col] * (capacity - tank);
                        tank = capacity;
                    }
                    positions.add(new double[] {
                            row, col, cost, tank
                    });
                }
                // move right
                if (person[1] < cols - 1 && person[3] > 0) {
                    row = (int)person[0];
                    col = (int)person[1] + 1;
                    cost = person[2];
                    tank = person[3] - 1;
                    if (grid[row][col] != 0) {
                        cost += grid[row][col] * (capacity - tank);
                        tank = capacity;
                    }
                    positions.add(new double[] {
                            row, col, cost, tank
                    });
                }
                if ((int)person[0] == rows - 1 && (int)person[1] == cols - 1) {
                    costs.add(person[2]);
                }
            }
            System.out.println(Collections.min(costs));
        }
    }



}
