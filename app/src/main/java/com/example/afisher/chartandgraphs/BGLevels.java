package com.example.afisher.chartandgraphs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.eazegraph.lib.charts.StackedBarChart;
import org.eazegraph.lib.models.BarModel;
import org.eazegraph.lib.models.StackedBarModel;

public class BGLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bglevels);


        StackedBarChart bgLevels = (StackedBarChart) findViewById(R.id.bgLevelsEZ);

        StackedBarModel bgLevel = new StackedBarModel("");

        bgLevel.addBar(new BarModel("<=50", 50f, 0xFF3F51B5));
        bgLevel.addBar(new BarModel("51-75", 25f, 0xFF2196F3));
        bgLevel.addBar(new BarModel("76-125", 50f, 0xFF4CAF50));
        bgLevel.addBar(new BarModel("126-199", 25f, 0xFFF44336));
        bgLevel.addBar(new BarModel(">=200", 50f, 0xFFD50000));


        bgLevels.addBar(bgLevel);

        bgLevels.invalidate();

        //get rid of tick mark thing

    }
}
