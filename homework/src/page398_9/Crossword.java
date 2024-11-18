package oop;

import java.util.Random;
import java.util.Scanner;

public class CrossWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] grid = new char[5][5];

        System.out.print("단어를 입력하세요: ");
        String word = scanner.nextLine();

        placeWordInGrid(grid, word, random);

        fillGridWithRandomChars(grid, random);

        printGrid(grid);
    }

    private static void placeWordInGrid(char[][] grid, String word, Random random) {
        int length = word.length();
        boolean placed = false;

        while (!placed) {
            int direction = random.nextInt(3); // 0: 가로, 1: 세로, 2: 대각선
            int row = random.nextInt(5);
            int col = random.nextInt(5);

            if (direction == 0 && col + length <= 5) { // 가로 배치
                for (int i = 0; i < length; i++) {
                    grid[row][col + i] = word.charAt(i);
                }
                placed = true;
            } else if (direction == 1 && row + length <= 5) { // 세로 배치
                for (int i = 0; i < length; i++) {
                    grid[row + i][col] = word.charAt(i);
                }
                placed = true;
            } else if (direction == 2 && row + length <= 5 && col + length <= 5) { // 대각선 배치
                for (int i = 0; i < length; i++) {
                    grid[row + i][col + i] = word.charAt(i);
                }
                placed = true;
            }
        }
    }

    private static void fillGridWithRandomChars(char[][] grid, Random random) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (grid[i][j] == '\0') { // 빈 칸인 경우
                    grid[i][j] = (char) ('a' + random.nextInt(26));
                }
            }
        }
    }

    private static void printGrid(char[][] grid) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
