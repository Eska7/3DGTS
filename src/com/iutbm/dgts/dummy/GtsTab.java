package com.iutbm.dgts.dummy;

import com.iutbm.dgts.Source;
import com.iutbm.dgts.exception.InvalidGTSFileException;
import com.iutbm.dgts.tools.DownloadFilesTask;
import com.iutbm.parser.GTSFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * A dummy item representing a piece of content.
 */
public class GtsTab {

    public String id;
    protected String name;
    protected URL url;

    public GtsTab(String id, String website_name, String lien){
        this.id = id;
        this.name = website_name;
        try {
            this.url = new URL(lien);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public String getContent(){
        DownloadFilesTask inter = new DownloadFilesTask();
        inter.execute(url);
        while (!Source.CONTENNU.containsKey(url.toString())){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        return Source.CONTENNU.get(url.toString()).toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
