package com.mmuzhev.massive.main;


import com.mmuzhev.massive.MassiveCreator;
import com.mmuzhev.massive.print.PrintMas;
import com.mmuzhev.massive.reverse.ReverseMas;

public class Main {

    public static void main(final String[] args) {
        ReverseMas<Integer> reversingMas = new ReverseMas<Integer>();
        PrintMas forPrint = new PrintMas();
        MassiveCreator creator = new MassiveCreator();
        creator.generateMas();
        System.out.println("Первоначальный массив:");
        forPrint.printMas(creator.getMassive());
        reversingMas.invert(creator.getMassive());
        System.out.println("Новый массив");
        forPrint.printMas(creator.getMassive());



    }
}
