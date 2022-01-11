package com.romanov;

import java.util.Arrays;

public class SingleLoopPrintableImpl implements MaxtrixPrintable{
    public void print(int[][] data) {
        int[] empty = {};
        if (data == null) {
            System.out.println("null");
        } else {
            for (int i = 0, j = 0; i < data.length; ) {
                if (data[i] == null) {
                    System.out.println(data[i]);
                    i++;
                } else if (Arrays.equals(data[i], empty)) {
                    System.out.println("empty");
                    i++;
                } else {
                    if (data[i] != null && j < data[i].length) {
                        System.out.print(data[i][j] + " ");
                        j++;
                    } else {
                        System.out.println();
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
}