package page399_11;

import java.util.Random;
import java.util.Scanner;

class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addScore() {
        this.score++;
    }
}

public class Gambling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("갬블링 게임에 참여할 선수 수를 입력하세요:");
        int playerCount = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        Player[] players = new Player[playerCount];

        for (int i = 0; i < playerCount; i++) {
            System.out.print((i + 1) + "번째 선수 이름>> ");
            String name = scanner.nextLine();
            players[i] = new Player(name);
        }

        boolean gameOver = false;

        while (!gameOver) {
            for (Player player : players) {
                System.out.println("[" + player.name + "]: <Enter> 키 입력");
                scanner.nextLine();

                int num1 = random.nextInt(3) + 1;
                int num2 = random.nextInt(3) + 1;
                int num3 = random.nextInt(3) + 1;

                System.out.println(num1 + " " + num2 + " " + num3);

                if (num1 == num2 && num2 == num3) {
                    System.out.println(player.name + " 아쉽군요!");
                    player.addScore();
                    if (player.score >= 2) { // 2점 이상인 경우 승리
                        System.out.println(player.name + "님이 이겼습니다!");
                        gameOver = true;
                        break;
                    }
                } else {
                    System.out.println("아쉽군요!");
                }
            }
        }
        scanner.close();
    }
}
