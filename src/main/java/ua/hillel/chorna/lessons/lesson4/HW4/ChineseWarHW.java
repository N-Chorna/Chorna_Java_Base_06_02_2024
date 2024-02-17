package ua.hillel.chorna.lessons.lesson4.HW4;

public class ChineseWarHW {
    public static void main(String[] args) {
        int warriorLeeATK = 13;
        int archerLeeATK = 24;
        int riderLeeATK = 46;

        int warriorMingATK = 9;
        int archerMingATK = 35;
        int riderMingATK = 12;

        int armyLee = 860;
        int armyMing = armyLee + armyLee/2;

        int LeeATK = (warriorLeeATK * armyLee) + (archerLeeATK * armyLee) + (riderLeeATK * armyLee);
        int MingATK = (warriorMingATK * armyMing) + (archerMingATK * armyMing) + (riderMingATK * armyMing);

        System.out.println("Overall Lee ATK = " + LeeATK);
        System.out.println("Overall Ming ATK = " + MingATK);


    }
}
