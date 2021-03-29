package com.home.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class Cwars2Test {
    private static final Logger LOGGER = Logger.getLogger("com.home.codewars.AppTest");

    /**
     * Rigorous Test.
     */
    @Test
    void testCwar2() {
        LOGGER.info(" Test Cwars2 ");
        /**
         * Input
         */
        String s = "Hola";
        String resok = "a";


        /**
         * Test Method
         */
        Cwars2 cwars2 = new Cwars2();
        Boolean res = cwars2.execute(s,resok);
        
        /**
         * Asserts
         */
        LOGGER.info(res.toString());
        assertEquals(res, true);
    }

       /**
     * Rigorous Test.
     */
    @Test
    void testCwar3() {
        LOGGER.info(" Test Cwars3 ");
        /**
         * Input
         */
        String s = "Hola";
        String resok = "la";


        /**
         * Test Method
         */
        Cwars2 cwars2 = new Cwars2();
        Boolean res = cwars2.execute(s,resok);
        
        /**
         * Asserts
         */
        LOGGER.info(res.toString());
        assertEquals(res, true);
    }


}
