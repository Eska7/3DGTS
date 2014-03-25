package com.iutbm.dgts;

import java.util.HashMap;

/**
 * @author Jean
 * @version 21/03/2014
 */

public class Source {

    public final static HashMap<String,String> FICHIER;

    static {
        FICHIER = new HashMap<String, String>();
        FICHIER.put("cone","http://gts.sourceforge.net/samples/cone.gts.gz");
        FICHIER.put("bunny","http://gts.sourceforge.net/samples/bunny.gts.gz");
        FICHIER.put("cube","http://gts.sourceforge.net/samples/cube.gts.gz");
        FICHIER.put("epcot","http://gts.sourceforge.net/samples/epcot.gts.gz");
        FICHIER.put("goblet","http://gts.sourceforge.net/samples/goblet.gts.gz");
        FICHIER.put("head","http://gts.sourceforge.net/samples/head.gts.gz");
    }

}
