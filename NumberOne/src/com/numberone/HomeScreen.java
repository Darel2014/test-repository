package com.numberone;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class HomeScreen extends ListActivity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] values = new String[] { "Android1", "Android2", "Android3",
	            "Android4", "Android5", "Android6", "Android7", "Android8",
	            "Android9", "Android10", "Android11", "Android12", "Android13",
	            "Android14", "Android15", "Android16", "Android17", "Android18",
	            "Android19", "Android20" };	
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
	  }
	}


