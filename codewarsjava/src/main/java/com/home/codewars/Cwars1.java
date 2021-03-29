package com.home.codewars;

import java.io.Serializable;
import java.util.logging.Logger;

public class Cwars1 implements Serializable {

    private static final long serialVersionUID = 4397743570065533470L;
    private static final Logger LOGGER = Logger.getLogger("com.home.codewars.Cwars1");

    /**
     * @param s
     * @return List<String>
     */
    public String[] execute(String s) {
        LOGGER.info(".................Method: execute...................");
        if (s.length() % 2 != 0) {
            s = s.concat("_");
        }

        String[] res = new String[s.length() / 2];
        String element = new String();
        int i = 0;
        int indiceElementoSalida = 0;

        for (i = 0; i < s.length(); i += 2) {
            element = "";
            element = element.concat(Character.toString(s.charAt(i))).concat(Character.toString(s.charAt(i + 1)));
            res[indiceElementoSalida] = element.toString();
            indiceElementoSalida++;
        }
        return res;
    }

    
    /** 
     * @param s
     * @return String[]
     */
    public String[] executeBest(String s) {
        LOGGER.info(".................Method: executeBest...................");
        if (s.length() % 2 == 1)
            s += "_";
        int n = s.length() / 2;

        String[] sub = new String[n];
        for (int i = 0; i < n; ++i)
            sub[i] = "" + s.charAt(i * 2) + s.charAt(1 + i * 2);

        return sub;
    }
}
