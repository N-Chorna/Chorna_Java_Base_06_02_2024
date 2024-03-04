package ua.hillel.chorna.lessons.lesson7.HW;

import java.util.Scanner;

public class ArraysHW {
    public static void main(String[] args) {
        int teamSize1 = 25;
        int teamSize2 = 25;
        int[] ageTeam1 = new int[teamSize1];
        int[] ageTeam2 = new int[teamSize2];
        for (int i = 0; i < teamSize1; i++) {
            ageTeam1 [i] = (int) (Math.random() * (22 + 1)) + 18;
        }
        for (int i = 0; i < teamSize2; i++) {
            ageTeam2 [i] = (int) (Math.random() * (22 + 1)) + 18;
        }
        System.out.println("Age of Team 1 players:");
        for (int teamAge : ageTeam1) {
            System.out.print(teamAge + ", ");
        }
        System.out.println();
        System.out.println("Age of Team 2 players:");
        for (int teamAge : ageTeam2) {
            System.out.print(teamAge + ", ");
        }
        System.out.println();
        double team1Average = 0;
        for (int teamAge : ageTeam1) {
            team1Average = team1Average + teamAge;
        }
        team1Average = team1Average / teamSize1;
        System.out.println("Team 1 average age is " + team1Average);
        double team2Average = 0;
        for (int teamAge : ageTeam2) {
            team2Average = team2Average + teamAge;
        }
        team2Average = team2Average / teamSize2;
        System.out.println("Team 2 average age is " + team2Average);
    }
}
