/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.app.DownloadManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Time;
import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes =QueryUtils.extractEarthquakes();

        /* earthquakes.add(new Earthquake("7.2","India","22 April 1997"));
        earthquakes.add(new Earthquake("8.2","London","24 February 2000"));
        earthquakes.add(new Earthquake("3.4","Tokyo","24 September 2006"));
        earthquakes.add(new Earthquake("6.7","Mexico City","29 October 2007"));
        earthquakes.add(new Earthquake("7.3","Moscow","29 July 2014"));
        earthquakes.add(new Earthquake("5.7","Rio de Janeiro","3 November 2015"));
        earthquakes.add(new Earthquake("7.9","Paris","19 July 20017"));
        */
        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter=new EarthquakeAdapter(this,earthquakes);
        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
