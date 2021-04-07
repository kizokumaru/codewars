package com.home.codewars;

import java.util.logging.Logger;

public class Cwars3 {
    private static final Logger LOGGER = Logger.getLogger("com.home.codewars.Cwars1");

    /**
     * @param str
     * @param ending
     * @return boolean
     */

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int contador = 0;

        // bucle que cuenta los numeros divisibles
        for (int i = (int) Math.sqrt(num); i > 1; i--) {
            if (num % i == 0) {
                contador++;
            }
        }

        return contador < 1;
    }

    public static boolean isPrimeBestSolutions(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}
