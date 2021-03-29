package com.home.codewars;

import java.util.logging.Logger;

public class Cwars2 {
    private static final Logger LOGGER = Logger.getLogger("com.home.codewars.Cwars1");
    /** 
     * @param str
     * @param ending
     * @return boolean
     */
    public boolean execute(String str, String ending) {
        LOGGER.info(".................Class: " + Cwars2.class.getName() + "...................");
        LOGGER.info(".................Method: execute...................");
        LOGGER.info(""+str.length());
        LOGGER.info(""+str.lastIndexOf(ending));
        
        return ending.length()>str.length()?false:str.substring(str.length() - ending.length(), str.length()).equals(ending.toString());
    }

    public boolean bestSolution(String str, String ending) {
        return str.endsWith(ending);
      }
}
