package com.iutbm.dgts;

/**
 * A dummy item representing a piece of content.
 */
public class GraphTab {

    public String id;
    public String content;
    public String title;
    public String url;

    public GraphTab(String id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.content = url;
    }

    @Override
    public String toString() {
        return content;
    }

    public String getTitle(){
        return title;
    }

    public String getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
