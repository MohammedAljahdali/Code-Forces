package com.mohammed;

import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if (w == 2)
            System.out.println("No");
        else if (w % 2 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
