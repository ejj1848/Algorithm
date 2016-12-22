package com.company;

import java.util.ArrayList;

/**
 * Created by ericjohn1 on 10/5/2016.
 */
public class shipCrewCaptain {

    ArrayList<SCCDice> diceList = new ArrayList<SCCDice>();
    boolean has6;
    boolean has5;
    boolean has4;
    static int pointTotal;
    static int rolls=1;
    static int failedRolls=0;
    static int prevDiceNum=0;

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        System.out.println("GAME START \n" +"-------------" );
        shipCrewCaptain SCC = new shipCrewCaptain();
        SCC.populateList();
        prevDiceNum = SCC.countDice();
        while (!SCC.has6 || !SCC.has5 || !SCC.has4) {
            SCC.printList();
            System.out.print("Rolls Done: " + rolls + " ");
            System.out.println("Flops: " + failedRolls);
            System.out.println("-------------");
            SCC.evaluateRoll();
            if (prevDiceNum == SCC.countDice()) {
                failedRolls++;
            }
            if (failedRolls == 3) {
                SCC.printList();
                System.out.println("You Flopped too hard. Try again!");
                System.exit(-1);
            }
            prevDiceNum = SCC.countDice();
            rolls++;
        }
        System.out.println(" ");
        System.out.println("You Scored "+ pointTotal + " points!");
    }
    public void populateList() {
        SCCDice d1 = new SCCDice();
        SCCDice d2 = new SCCDice();
        SCCDice d3 = new SCCDice();
        SCCDice d4 = new SCCDice();
        SCCDice d5 = new SCCDice();

        d1.rollDie();
        d2.rollDie();
        d3.rollDie();
        d4.rollDie();
        d5.rollDie();

        diceList.add(d1);
        diceList.add(d2);
        diceList.add(d3);
        diceList.add(d4);
        diceList.add(d5);

    }

    public void evaluateRoll() {

        label1:
        if (!has6) {
            for (SCCDice sccDice : diceList) {
                if (sccDice.getValue() == 6) {
                    has6 = true;
                    sccDice.setValue(0);
                    break label1;
                }
            }
        }
        label2:
        if (has6 && !has5) {
            for (SCCDice sccDice : diceList) {
                if (sccDice.getValue() == 5) {
                    has5 = true;
                    sccDice.setValue(0);
                    break label2;
                }
            }
        }
        label3:
        if(has6 && has5 && !has4)
            for (SCCDice sccDice : diceList) {
                if (sccDice.getValue() == 4) {
                    has4 = true;
                    sccDice.setValue(0);
                    break label3;
                }
            }
        removeDice();
        finalTotal();
        reroll();
    }

    public void removeDice() {
        int diceCounter=0;
        while (diceCounter < 4) {
            label:
            for (SCCDice sccDice : diceList) {
                diceCounter++;
                if (sccDice.getValue() == 0) {
                    diceList.remove(sccDice);
                    break label;
                }
            }
        }
    }

    public int countDice() {
        int diceCount=0;
        for (SCCDice sccDice : diceList) {
            diceCount++;
        }
        return diceCount;
    }
    public void reroll() {
        for (SCCDice sccDice : diceList) {
            sccDice.rollDie();
        }
    }

    public void finalTotal() {
        pointTotal=0;
        for (SCCDice sccDice : diceList) {
            pointTotal+=sccDice.getValue();
        }
    }
    public void printList() {

        for (SCCDice sccDice : diceList) {
            System.out.print(sccDice.getValue() + " ");
        }
        System.out.println(" ");
    }
}
class SCCDice {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int  rollDie() {
        double that = Math.random()*(6)+1;
        this.value = (int) that;
        return value;
    }
}