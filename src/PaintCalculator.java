package com.tsi.training.department.indiana.chandisingh.paintcalculator;
import java.util.Scanner;
public class PaintCalculator {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        //Calculates total wall area
        System.out.println("How many walls do you want to paint?");
        int numOfWalls=scan.nextInt();
        float totalWallArea=0f;
        //float wallHeight=0f;
        //float wallWidth=0f;

        for(int n=1; n<=numOfWalls; n++){
            System.out.println("What is the height of wall "+n+" in M?");
            float wallHeight=scan.nextFloat();
            System.out.println("What is the width of wall "+n+" in M?");
            float wallWidth=scan.nextFloat();
            totalWallArea+=(wallWidth*wallHeight);
        }


        System.out.println("How much, in £, does one tin of your chosen paint cost?");
        float tinPrice=scan.nextFloat();

        System.out.println("How many layers of paint do you want to use?");
        int layersOfPaint=scan.nextInt();

        System.out.println("what is the coverage of your chosen paint in SQ M/L");
        float coveragePerLitre=scan.nextFloat();

        System.out.println("How much paint in L is in your chosen tin?");
        float paintPerTin=scan.nextFloat();

        System.out.println("How much, in £, is your budget?");
        float budget=scan.nextFloat();


        //Calculates area of excluded areas
        System.out.println("Are there any areas you don't want to paint, such as windows or doors? Type y or n");
        String wallExclusionQ= scan.nextLine().toLowerCase();
        if(wallExclusionQ.equals("y")){

            System.out.println("How many areas do you not want to paint?");
            int wallExclusionNum= scan.nextInt();
            int i=1;
            float excludedArea =0f;
            float excludedHeight=0f;
            float excludedWidth=0f;
            while (i<=wallExclusionNum){
                System.out.println("What is the height of exclusion area "+i+"?");
                excludedHeight=scan.nextInt();
                System.out.println("What is the width of exclusion area ");
                excludedWidth=scan.nextInt();
                excludedArea+=(excludedWidth*excludedHeight);
                i++;
            }
            totalWallArea-=excludedArea;
        }



        float paintNeeded=(totalWallArea/coveragePerLitre)*layersOfPaint;
        double tinsNeeded=Math.ceil(paintNeeded/paintPerTin);
        double cost=tinsNeeded*tinPrice;
        double leftover=(tinsNeeded*paintPerTin)-paintNeeded;

        int budgetHolder =0;

        if (budget<cost){
            budgetHolder=-1;
        }
        else if(budget>cost){
            budgetHolder=1;
        }

        System.out.println("You need "+paintNeeded+"L of paint.");
        System.out.println("You need "+tinsNeeded+" tins of paint, and will have "+leftover+"L of paint leftover.");
        System.out.println("This will cost £"+cost+".");

        switch (budgetHolder){
            case 1:
                System.out.println("This is under budget!") ;
                break;
            case 0:
                // System.out.println("This is the same as your budget!") ;
                break;
            case -1:
                System.out.println("This is over budget! Try finding a different paint.") ;
                break;
            default:
        }






    }
}
