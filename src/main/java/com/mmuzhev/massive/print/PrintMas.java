package com.mmuzhev.massive.print;
/*
* Print massive*/
public class PrintMas {
    /**
    * Print integer massive
    * @param massive of integer
     */
    public static void printMas(final Integer[] massive) {
        for (int i = 0; i < massive.length; i++) {
            System.out.println("mas[" + i + "] = " + massive[i]);
        }
        System.out.println();
    }
}

