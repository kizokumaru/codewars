package com.home.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class Cwars1Test {
    private static final Logger LOGGER = Logger.getLogger("com.home.codewars.AppTest");

    /**
     * Rigorous Test.
     */
    @Test
    void testCwarsEvenWord() {
        LOGGER.info(" Test Cwars1 ");
        /**
         * Input
         */
        String s = "Hola";
        
        String[] resok = new String[2];
        resok[0] = "Ho";
        resok[1] = "la";
        

        /**
         * Test Method
         */
        Cwars1 cwars1 = new Cwars1();
        String[] res = cwars1.executeBest(s);
        
        /**
         * Asserts
         */
        LOGGER.info(Arrays.toString(res) + " " + Arrays.toString(resok));
        assertEquals(Arrays.toString(resok).equals(Arrays.toString(res)), true);
    }

    @Test
    void testCwarsOddWord() {
        LOGGER.info(" Test Cwars1 ");
        /**
         * Input
         */
        String s = "Holas";
        
        String[] resok = new String[3];
        resok[0] = "Ho";
        resok[1] = "la";
        resok[2] = "s_";
        

        /**
         * Test Method
         */
        Cwars1 cwars1 = new Cwars1();
        String[] res = cwars1.executeBest(s);
        
        /**
         * Asserts
         */
        LOGGER.info(Arrays.toString(res) + " " + Arrays.toString(resok));
        assertEquals(Arrays.toString(resok).equals(Arrays.toString(res)), true);
    }
}
