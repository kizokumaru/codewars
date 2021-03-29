package com.home.codewars;

import java.util.logging.Logger;

/**
 * Hello world!
 */
public final class App {
    private static final String PRUEBA_DE_LOG = "Prueba de log";
    private static final Logger LOGGER = Logger.getLogger("com.home.codewars.App");

    private App() {}

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        LOGGER.info(PRUEBA_DE_LOG);
        Cwars1 cwars = new Cwars1();

        System.out.println(cwars.execute("Hola"));
    }
}
