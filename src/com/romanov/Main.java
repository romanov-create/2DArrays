package com.romanov;

public class Main {
    public static void main(String[] args) {
        int[][] data = null;
        MaxtrixPrintable Nested = new NestedLoopsPrintableImpl();
        MaxtrixPrintable Single = new SingleLoopPrintableImpl();


        if (Math.random() > 0.5) {
            System.out.println("NestedLoopsPrintable :");
            Nested.print(data);
        } else {
            System.out.println("SingleLoopPrintable :");
            Single.print(data);
        }
    }
}
