package com.example.afisher.chartandgraphs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.eazegraph.lib.charts.StackedBarChart;
import org.eazegraph.lib.models.BarModel;
import org.eazegraph.lib.models.StackedBarModel;

public class InsulinDelivery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insulin_delivery);


        StackedBarChart stackedBarChart = (StackedBarChart) findViewById(R.id.stackedbarchart);

        StackedBarModel marchSecond = new StackedBarModel("3/2");
        marchSecond.addBar(new BarModel("29.25", 29.25f, 0xFFFFF176));
        marchSecond.addBar(new BarModel("26.40", 26.4f, 0xFF2196F3));


        StackedBarModel marchThird = new StackedBarModel("3/3");
        marchThird.addBar(new BarModel("25.30", 25.30f, 0xFFFFF176));
        marchThird.addBar(new BarModel("24.40", 24.40f, 0xFF2196F3));

        StackedBarModel marchFourth= new StackedBarModel("3/4");
        marchFourth.addBar(new BarModel("24.55", 24.55f, 0xFFFFF176));
        marchFourth.addBar(new BarModel("27.55", 27.55f, 0xFF2196F3));

        StackedBarModel marchFifth= new StackedBarModel("3/5");
        marchFifth.addBar(new BarModel("29.25", 29.25f, 0xFFFFF176));
        marchFifth.addBar(new BarModel("31.35", 31.35f, 0xFF2196F3));

        StackedBarModel marchSixth= new StackedBarModel("3/6");
        marchSixth.addBar(new BarModel("28.75", 28.75f, 0xFFFFF176));
        marchSixth.addBar(new BarModel("25.55", 25.55f, 0xFF2196F3));

        StackedBarModel marchSeventh= new StackedBarModel("3/7");
        marchSeventh.addBar(new BarModel("23.40", 23.40f, 0xFFFFF176));
        marchSeventh.addBar(new BarModel("29.25", 29.25f, 0xFF2196F3));

        StackedBarModel marchEighth = new StackedBarModel("3/8");
        marchEighth.addBar(new BarModel("29.25", 29.25f, 0xFFFFF176));
        marchEighth.addBar(new BarModel("19.85", 19.85f, 0xFF2196F3));


        stackedBarChart.addBar(marchSecond);
        stackedBarChart.addBar(marchThird);
        stackedBarChart.addBar(marchFourth);
        stackedBarChart.addBar(marchFifth);
        stackedBarChart.addBar(marchSixth);
        stackedBarChart.addBar(marchSeventh);
        stackedBarChart.addBar(marchEighth);

        stackedBarChart.startAnimation();

    }
}
