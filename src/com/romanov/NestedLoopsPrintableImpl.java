package com.romanov;

import java.util.Arrays;

public class NestedLoopsPrintableImpl implements MaxtrixPrintable{
    public void print(int[][] data) {
        int[] empty = {};
        if (data == null) {
            System.out.println("null");
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    System.out.println(data[i]);
                } else if (Arrays.equals(data[i], empty)) {
                    System.out.println("empty");
                } else {
                    for (int j = 0; j < data[i].length; j++) {
                        System.out.print(data[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}
