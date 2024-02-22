package ua.hillel.chorna.lessons.lesson5.HW5;

import java.util.Scanner;

public class CounterStrikeHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the first team");
        String firstTeam = sc.nextLine();
        System.out.println("Team 1 - " + firstTeam);
        System.out.println("Please enter frags acquired by Player 1 (Team 1)");
        int player1Team1 = 0;
        if (sc.hasNextInt()) {
            player1Team1 = sc.nextInt();
        } else {
            System.out.println("Wrong data. Please enter a whole number");
            System.exit(0);
            player1Team1 = sc.nextInt();
        }
        System.out.println("Please enter frags acquired by Player 2 (Team 1)");
        int player2Team1 = 0;
        if (sc.hasNextInt()) {
            player2Team1 = sc.nextInt();
        } else {
            System.out.println("Wrong data. Please enter a whole number");
            System.exit(0);
        }
        System.out.println("Please enter frags acquired by Player 3 (Team 1)");
        int player3Team1 = 0;
        if (sc.hasNextInt()) {
            player3Team1 = sc.nextInt();
        } else {
            System.out.println("Wrong data. Please enter a whole number");
            System.exit(0);
        }
        System.out.println("Please enter frags acquired by Player 4 (Team 1)");
        int player4Team1 = 0;
        if (sc.hasNextInt()) {
            player4Team1 = sc.nextInt();
        } else {
            System.out.println("Wrong data. Please enter a whole number");
            System.exit(0);
        }
        System.out.println("Please enter frags acquired by Player 5 (Team 1)");
        int player5Team1 = 0;
        if (sc.hasNextInt()) {
            player5Team1 = sc.nextInt();
        } else {
            System.out.println("Wrong data. Please enter a whole number");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Please enter the name of the second team");
        String secondTeam = sc.nextLine();
        System.out.println("Team 2 - " + secondTeam);
        System.out.println("Please enter frags acquired by Player 1 (Team 2)");
        int player1Team2 = 0;
        if (sc.hasNextInt()) {
            player1Team2 = sc.nextInt();
        } else {
            System.out.println("Wrong data. Please enter a whole number");
            System.exit(0);
        }
        System.out.println("Please enter frags acquired by Player 2 (Team 2)");
        int player2Team2 = 0;
        if (sc.hasNextInt()) {
            player2Team2 = sc.nextInt();
        } else {
            System.out.println("Wrong data. Please enter a whole number");
            System.exit(0);
        }
        System.out.println("Please enter frags acquired by Player 3 (Team 2)");
        int player3Team2 = 0;
        if (sc.hasNextInt()) {
            player3Team2 = sc.nextInt();
        } else {
            System.out.println("Wrong data. Please enter a whole number");
            System.exit(0);
        }
        System.out.println("Please enter frags acquired by Player 4 (Team 2)");
        int player4Team2 = 0;
        if (sc.hasNextInt()) {
            player4Team2 = sc.nextInt();
        } else {
            System.out.println("Wrong data. Please enter a whole number");
            System.exit(0);
        }
        System.out.println("Please enter frags acquired by Player 5 (Team 2)");
        int player5Team2 = 0;
        if (sc.hasNextInt()) {
            player5Team2 = sc.nextInt();
        } else {
            System.out.println("Wrong data. Please enter a whole number");
            System.exit(0);
        }
        int team1Average = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1) / 5;
        System.out.println("Team 1 average score - " + team1Average);
        int team2Average = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2) / 5;
        System.out.println("Team 2 average score - " + team2Average);
        int winningTeam = (Math.max(team1Average, team2Average));
        if (team1Average > team2Average) {
            System.out.println("Team " + firstTeam + " is the WINNER. It scored " + team1Average);
        } else if (team2Average > team1Average) {
            System.out.println("Team " + secondTeam + " is the WINNER. It scored " + team2Average);
        } else
            System.out.println("Draw");
    }
}
