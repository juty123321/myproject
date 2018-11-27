package com.tom;
import java.util.Random;
public class PokerGame {
    public static void main(String[] args) {
        String[] c = { "S","H","D","C" };
        char[] p = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K' };
        int[] poker = new int[52];
        for (int i = 0; i < poker.length; i++) {
            poker[i] = i;
        }
        for (int i = 0; i < 1000; i++) {
            int pt1 = (int) (Math.random() * 52);
            int pt2 = (int) (Math.random() * 52);
            int tmp = poker[pt1];
            poker[pt1] = poker[pt2];
            poker[pt2] = tmp;
        }
        int pt = 0;
        for (int k = 0; k < 4; k++) {
            System.out.print("User [" + (k + 1) + "]:");
            for (int j = 0; j < 13; j++) {
                int pk = poker[pt];
                System.out.print(" " + c[pk / 13] + p[pk % 13]);
                pt++;
            }
            System.out.println();
        }
    }
}