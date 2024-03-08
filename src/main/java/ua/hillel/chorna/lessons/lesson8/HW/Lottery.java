package ua.hillel.chorna.lessons.lesson8.HW;

public class Lottery {
    public static void main(String[] args) {
        int[] playerNo = new int[7];
        int[] lotteryNo = new int[7];
        for (int i = 0; i < 7; i++) {
            playerNo[i] = (int) (Math.random() * 10);
            lotteryNo[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (playerNo[i] > playerNo[j]) {
                    int sort = playerNo[i];
                    playerNo[i] = playerNo[j];
                    playerNo[j] = sort;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (lotteryNo[i] > lotteryNo[j]) {
                    int sort = lotteryNo[i];
                    lotteryNo[i] = lotteryNo[j];
                    lotteryNo[j] = sort;
                }
            }
        }
        int match = 0;
        for (int i = 0; i < 7; i++) {
            if (lotteryNo[i] == playerNo[i]) {
                match++;
            }
        }
        for (int number : playerNo) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : lotteryNo) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Match(es) " + match);
    }
}
