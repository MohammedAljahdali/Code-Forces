package com.mohammed;

import java.util.Scanner;

public class FittingOnTheBed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float l = scanner.nextInt();
        float w = scanner.nextInt();
        float h = scanner.nextInt();
        float x = scanner.nextInt();
        float y = scanner.nextInt();
        double a = scanner.nextInt();
        double allowedLength;
        double allowedWidth;
        double cos;
        double sin;

        if (a <= 180) {
            if (a <= 90)
                cos = Math.cos(a);
            else
                cos = Math.cos(a) * - 1;
            sin = Math.sin(a);
            allowedLength = h * 1;
        } else if ( a > 180) {
            if (a >= 270)
                cos = Math.cos(a);
            else
                cos = Math.cos(a) * - 1;
            sin = Math.sin(a) * - 1;

        }
//        if ()
//            System.out.println("NO");
//        else
//            System.out.println("YES");

    }
}
