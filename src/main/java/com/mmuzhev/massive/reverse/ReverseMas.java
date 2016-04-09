package com.mmuzhev.massive.reverse;

import com.mmuzhev.massive.forInterface.InterfaceMassive;

/*
* Class integer array
 */
public class ReverseMas<T> implements InterfaceMassive<T>  {
    /**
    * Reverse array
    * @param array
    * @return reversed array
    */
    public T[] invert( T[] array) {
        T buf;
        try {
            for (int i = 0; i < array.length / 2 ; i++) {
                buf = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = buf;
            }
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }

        return array;
    }

}
