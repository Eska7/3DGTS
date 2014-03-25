package com.iutbm.dgts.dummy;

import com.iutbm.dgts.exception.IvalidGTSfileException;
import com.iutbm.parser.GTSFile;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * A dummy item representing a piece of content.
 */
public class GtsTab {
    public String id;
    public String name;
    public String url;

    public GtsTab(String id, String website_name,
                  String website_url)
    {
        this.id = id;
        this.name = website_name;
        this.url = website_url;
    }

    public String getContent(){
        try {
            GTSFile file = new GTSFile(new URL(url));
            return file.toString();
        } catch (IvalidGTSfileException e) {
            return e.getMessage();
        } catch (MalformedURLException e) {
            return e.getMessage();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
