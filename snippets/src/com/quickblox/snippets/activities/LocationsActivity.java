package com.quickblox.snippets.activities;

import android.app.Activity;
import android.os.Bundle;
import com.quickblox.snippets.R;
import com.quickblox.snippets.SnippetsList;
import com.quickblox.snippets.modules.SnippetsLocations;

/**
 * User: Oleg Soroka
 * Date: 02.10.12
 * Time: 09:38
 */
public class LocationsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snippets_list);

        SnippetsLocations snippets = new SnippetsLocations(this);
        SnippetsList list = (SnippetsList) findViewById(R.id.list);
        list.initialize(snippets);
    }
}