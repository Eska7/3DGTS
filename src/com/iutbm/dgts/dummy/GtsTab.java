package com.iutbm.dgts.dummy;

import com.iutbm.dgts.Source;
import com.iutbm.dgts.tools.DownloadFilesTask;

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
        if(Source.CONTENU.containsKey(url.toString())) return Source.CONTENU.get(url.toString()).toString();
        DownloadFilesTask inter = new DownloadFilesTask();
        inter.execute(url);
        while (!Source.CONTENU.containsKey(url.toString())){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        return Source.CONTENU.get(url.toString()).toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
