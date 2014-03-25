package com.iutbm.dgts.dummy;

import com.iutbm.dgts.Source;

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
public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<GtsTab> ITEMS = new ArrayList<GtsTab>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, GtsTab> ITEM_MAP = new HashMap<String, GtsTab>();

	static {
        Integer i = 1;
        for (Map.Entry<String,String> element : Source.FICHIER.entrySet()){
            System.out.println("@#! " + element.getKey() + " " + element.getValue());
            addItem(new GtsTab(i.toString(),element.getKey(),element.getValue()));
            i += 1;
        }
	}

	private static void addItem(GtsTab item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

}
