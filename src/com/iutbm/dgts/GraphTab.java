package com.iutbm.dgts;

/**
 * A dummy item representing a piece of content.
 */
public class GraphTab {
    public String id;
    public String content;

    public GraphTab(String id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
