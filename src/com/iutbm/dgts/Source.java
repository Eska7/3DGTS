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
        FICHIER.put("head", "http://ns303921.ovh.net/gts/head.gts");
        FICHIER.put("sphere5", "http://ns303921.ovh.net/gts/sphere5.gts");
        FICHIER.put("sphere20", "http://ns303921.ovh.net/gts/sphere20.gts");
        FICHIER.put("goblet", "http://ns303921.ovh.net/gts/goblet.gts");
        FICHIER.put("horse", "http://ns303921.ovh.net/gts/horse.gts");
        FICHIER.put("tie", "http://ns303921.ovh.net/gts/tie.gts");
        FICHIER.put("space_station", "http://ns303921.ovh.net/gts/space_station.gts");
        FICHIER.put("cube", "http://ns303921.ovh.net/gts/cube.gts");
        FICHIER.put("icosa", "http://ns303921.ovh.net/gts/icosa.gts");
        FICHIER.put("bunny", "http://ns303921.ovh.net/gts/bunny.gts");
        FICHIER.put("helix2", "http://ns303921.ovh.net/gts/helix2.gts");
        FICHIER.put("epcot", "http://ns303921.ovh.net/gts/epcot.gts");
        FICHIER.put("space_shuttle", "http://ns303921.ovh.net/gts/space_shuttle.gts");
        FICHIER.put("cone", "http://ns303921.ovh.net/gts/cone.gts");
        FICHIER.put("tetrahedron", "http://ns303921.ovh.net/gts/tetrahedron.gts");
        FICHIER.put("seashell", "http://ns303921.ovh.net/gts/seashell.gts");
        FICHIER.put("x_wing", "http://ns303921.ovh.net/gts/x_wing.gts");
    }

}
