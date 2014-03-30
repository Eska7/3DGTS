package com.iutbm.dgts;

import com.iutbm.parser.GTSFile;

import java.util.HashMap;

/**
 * @author Jean
 * @version 21/03/2014
 */

public class Source {

    public final static HashMap<String,String> LIEN;
    public static HashMap<String,GTSFile> CONTENNU;

    static {
        CONTENNU = new HashMap<String, GTSFile>();
        LIEN = new HashMap<String, String>();
        LIEN.put("head", "http://ns303921.ovh.net/gts/head.gts");
        LIEN.put("sphere5", "http://ns303921.ovh.net/gts/sphere5.gts");
        LIEN.put("sphere20", "http://ns303921.ovh.net/gts/sphere20.gts");
        LIEN.put("goblet", "http://ns303921.ovh.net/gts/goblet.gts");
        LIEN.put("horse", "http://ns303921.ovh.net/gts/horse.gts");
        LIEN.put("tie", "http://ns303921.ovh.net/gts/tie.gts");
        LIEN.put("space_station", "http://ns303921.ovh.net/gts/space_station.gts");
        LIEN.put("cube", "http://ns303921.ovh.net/gts/cube.gts");
        LIEN.put("icosa", "http://ns303921.ovh.net/gts/icosa.gts");
        LIEN.put("bunny", "http://ns303921.ovh.net/gts/bunny.gts");
        LIEN.put("helix2", "http://ns303921.ovh.net/gts/helix2.gts");
        LIEN.put("epcot", "http://ns303921.ovh.net/gts/epcot.gts");
        LIEN.put("space_shuttle", "http://ns303921.ovh.net/gts/space_shuttle.gts");
        LIEN.put("cone", "http://ns303921.ovh.net/gts/cone.gts");
        LIEN.put("tetrahedron", "http://ns303921.ovh.net/gts/tetrahedron.gts");
        LIEN.put("seashell", "http://ns303921.ovh.net/gts/seashell.gts");
        LIEN.put("x_wing", "http://ns303921.ovh.net/gts/x_wing.gts");
    }

}
