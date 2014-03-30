package com.iutbm.dgts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class TabBuilder {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<GraphTab> ITEMS = new ArrayList<GraphTab>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, GraphTab> ITEM_MAP = new HashMap<String, GraphTab>();

	static {
        Integer i = 1;
        for(Map.Entry<String,String> entry : Source.LIEN.entrySet()){
            addItem(new GraphTab(i.toString(), entry.getKey(), entry.getKey()));
        }
        addItem(new GraphTab("1","1a","http://gts.sourceforge.net/samples/bunny.gts.gz"));
        addItem(new GraphTab("2","2a","2b"));
        addItem(new GraphTab("3","3a","3b"));
    }

	private static void addItem(GraphTab item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

}
