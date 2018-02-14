package com.company.chocomilk;

public class ChocoMilkClass {

    public static void main(String[] args) {

        int milkNum = 99;
        String word = "bottles";

        for (milkNum = 99; milkNum > 0; milkNum--) {

            System.out.println(milkNum + " " + word + " of chocomilk on the wall!");
            System.out.println(milkNum + " " + word + " of chocomilk!");

            milkNum = milkNum - 1;

            if (milkNum == 1) {
                word = "bottle";
            }
            if (milkNum == 0) {
                word = "bottles";
            }
            System.out.println("You take one down, pass it around, " + milkNum + " " + word + " of chocomilk on the wall!");

            if (milkNum == 0) {
                System.out.println("No more bottles of chocomilk on the wall!");
            }
            milkNum++;
        }
    }
}
