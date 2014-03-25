package com.iutbm.dgts.exception;

/**
 * @author Jean
 * @version 25/03/2014
 */

public class IvalidGTSfileException extends Exception {

    private String filename;

    public IvalidGTSfileException(String filename){
        super("Invalid GTS file " + filename);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
}
