package com.mmuzhev.massive;

/* generating massive with 100 elements
    @params mas massive of Integer
    */
public class MassiveCreator {
    private Integer[] massive;
    public MassiveCreator() {
        this.massive = new Integer[100];
    }
    public Integer[] getMassive() {
        return  this.massive;
    }

    public void generateMas() {
        for (int i = 0; i < 100; i++) {
            this.massive[i] = i;
        }
    }

}
