/**
 * Copyright (C) 2013 Jason Scott
 */
package edu.nyit.pocketslateUtils;

import android.provider.BaseColumns;

/**
 * <p>Title: PocketSlateReaderContract.java</p>
 * <p>Description: Reader contract for PocketSlateDbHelper.</p>
 * @author jasonscott
 *
 */
public final class PocketSlateReaderContract {

	public PocketSlateReaderContract() {}	// Empty constructor

	// Inner class that defines the tables contents
	public static abstract class ItemEntry implements BaseColumns {
		
		// Database column names
		public static final String[] COLUMN_NAMES = {
			"title",
			"description",
			"link",
			"image_url",
			"content",
			"category",
			"date_published",
			"author",
			"saved"	
		};

		// Database table names
		public static final String[] TABLE_NAMES = {
			"top_stories", 
			"saved_stories",
			"news", 
			"features", 
			"staff", 
			"sports",
			"clubs_and_organizations",
			"editorials", 
			"thats_what_she_said", 
			"bears_to_watch",
		    "search"
        };
		
		// Staff table names
		public static final String[] STAFF_TABLE_NAMES = {
			"john_hanc",
			"erica_brandt",
			"anthony_mcmahon",
			"lauren_sharkey",
			"miasha_lee",
			"matt_santamaria",
			"meredith_gerdes",
			"mike_cerullo",
			"alexandros_gounaris",
			"kulsum_mirza",
			"kristin_metzler",
			"rachel_udkow",
			"jaheel_felix",
			"sana_hassan",
			"pranav_krishnamurthy"
		};
		
	}
}
