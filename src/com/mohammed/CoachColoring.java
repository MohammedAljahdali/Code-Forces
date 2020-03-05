//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.PrintStream;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(new File("coach.in"));
//        PrintStream printStream = new PrintStream(new FileOutputStream("output"));
//        int testCases = scanner.nextInt();
//        for (int i = 0; i < testCases; i++) {
//            int n = scanner.nextInt();
//            boolean[][] grid = new boolean[n][n];
//            int rp = scanner.nextInt();
//            int cp = scanner.nextInt();
//            for (int j = 0; j < rp; j++) {
//                int row = scanner.nextInt() - 1;
//                for (int k = 0; k < n; k++) {
//                    grid[row][k] = true;
//                }
//            }
//
//            for (int j = 0; j < cp; j++) {
//                int col = scanner.nextInt() - 1;
//                for (int k = 0; k < n; k++) {
//                    grid[k][col] = true;
//                }
//            }
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < n; k++) {
//                    if (!grid[j][k])
//                        count++;
//                }
//            }
//            printStream.println(count);
//        }
//    }
//}
