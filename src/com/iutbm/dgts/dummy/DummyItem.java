package com.iutbm.dgts.dummy;

/**
 * A dummy item representing a piece of content.
 */
public class DummyItem {
    public String id;
    public String website_name;
    public String website_url;

    public DummyItem(String id, String website_name,
                     String website_url)
    {
        this.id = id;
        this.website_name = website_name;
        this.website_url = website_url;
    }

    public String getContent(){
        return website_url;
    }

    @Override
    public String toString() {
        return website_name;
    }
}
