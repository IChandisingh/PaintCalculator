package com.tsi.training.department.indiana.chandisingh.paintcalculator;
import java.util.Scanner;
public class PaintCalculator {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.println("What is the wall height in your house M?");
        float wallHeight=scan.nextFloat();

        System.out.println("What is the total width of all of your walls in M?");
        float totalWidth=scan.nextFloat();

        System.out.println("How much, in £, does one tin of your chosen paint cost?");
        float tinPrice=scan.nextFloat();

        System.out.println("How many layers of paint do you want to use?");
        int layersOfPaint=scan.nextInt();

        System.out.println("what is the coverage of your chosen paint in SQ M/L");
        float coveragePerLitre=scan.nextFloat();

        System.out.println("How much paint in L is in your chosen tin?");
        float paintPerTin=2.5f;

        float paintNeeded=((totalWidth*wallHeight)/coveragePerLitre)*layersOfPaint;
        double tinsNeeded=Math.ceil(paintNeeded/paintPerTin);
        double cost=tinsNeeded*tinPrice;
        double leftover=(tinsNeeded*paintPerTin)-paintNeeded;

        System.out.println("You need "+paintNeeded+"L of paint.");
        System.out.println("You need "+tinsNeeded+" tins of paint, and have "+leftover+"L leftover.");
        System.out.println("This will cost £"+cost+".");


    }
}
