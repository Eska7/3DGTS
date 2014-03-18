package com.iutbm.dgts;

import android.app.Activity;

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
        // TODO CA MARCHE PAS!!!!!
        //Activity act = new Activity();
		//addItem(new GraphTab("1", act.getResources().getResourceName(R.raw.bunny)));
		//addItem(new GraphTab("2",act.getResources().getResourceName(R.raw.cone)));
		//addItem(new GraphTab("3",act.getResources().getResourceName(R.raw.cube)));
	}

	private static void addItem(GraphTab item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

}
