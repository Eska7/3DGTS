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
        FICHIER.put("cone","http://ns303921.ovh.net/gts/cone.gts");
        FICHIER.put("bunny","http://ns303921.ovh.net/gts/bunny.gts");
        FICHIER.put("cube","http://ns303921.ovh.net/gts/cube.gts");
        FICHIER.put("epcot","http://ns303921.ovh.net/gts/epcot.gts");
        FICHIER.put("goblet","http://ns303921.ovh.net/gts/goblet.gts");
        FICHIER.put("head","http://ns303921.ovh.net/gts/head.gts");
    }

}
