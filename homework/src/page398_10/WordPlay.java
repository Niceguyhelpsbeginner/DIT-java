package page398_10;

import java.util.Random;
import java.util.Scanner;

public class WordPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"happy", "morning", "package", "together"};
        String selectedWord = words[random.nextInt(words.length)];
        String shuffledWord = shuffleWord(selectedWord, random);

        System.out.println("10초 안에 단어를 맞추세요!!");
        System.out.println(shuffledWord);

        long startTime = System.currentTimeMillis();

        String userGuess = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        double elapsedTime = (endTime - startTime) / 1000.0;

        if (elapsedTime > 10) {
            System.out.println("시간 초과!");
        } else if (userGuess.equals(selectedWord)) {
            System.out.printf("성공!!! %.3f초 경과\n", elapsedTime);
        } else {
            System.out.println("실패!");
        }
        scanner.close();
    }

    private static String shuffleWord(String word, Random random) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j = random.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
