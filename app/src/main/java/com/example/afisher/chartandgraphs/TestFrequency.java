package com.example.afisher.chartandgraphs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.ArrayList;
import java.util.HashMap;

//https://www.numetriclabz.com/android-scatter-chart-using-mpandroidchart-library-tutorial/


public class TestFrequency extends AppCompatActivity {
    private ScatterChart mChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_frequency);


        mChart = (ScatterChart) findViewById(R.id.testFreq);
        mChart.getDescription().setEnabled(false);

        mChart.setDrawGridBackground(false);
        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(false);
        mChart.setPinchZoom(false);







        ArrayList<Entry> entries = new ArrayList<>();

        //14
        entries.add(new Entry(2.25f,14));
        entries.add(new Entry(2.75f,14));
        entries.add(new Entry(3.75f,14));
        entries.add(new Entry(4.75f,14));
        entries.add(new Entry(8.25f,14));

//13
        entries.add(new Entry(1.5f,13));
        entries.add(new Entry(1.8f,13));
        entries.add(new Entry(4.1f,13));
        entries.add(new Entry(5.75f,13));

//12
        entries.add(new Entry(2.25f,12));
        entries.add(new Entry(2.5f,12));
        entries.add(new Entry(2.6f,12));
        entries.add(new Entry(4.25f,12));
        entries.add(new Entry(5.25f,12));

        //11
        entries.add(new Entry(1.25f,11));
        entries.add(new Entry(2.1f,11));
        entries.add(new Entry(3.5f,11));
        entries.add(new Entry(6.25f,11));

        //10
        entries.add(new Entry(2.2f,10));
        entries.add(new Entry(6.1f,10));

        //9
        entries.add(new Entry(2.9f,9));
        entries.add(new Entry(3.5f,9));
        entries.add(new Entry(4f,9));

        //8
        entries.add(new Entry(2.75f,8));
        entries.add(new Entry(4.5f,8));
        entries.add(new Entry(6.45f,8));

        //7
        entries.add(new Entry(2.2f,7));
        entries.add(new Entry(3.2f,7));
        entries.add(new Entry(5.75f,7));

//5
        entries.add(new Entry(1.9f,5));

//4
        entries.add(new Entry(2.25f,4));
        entries.add(new Entry(7.5f,4));
        entries.add(new Entry(8.25f,4));

//3
        entries.add(new Entry(1.3f,3));
        entries.add(new Entry(2.6f,3));

        //2
        entries.add(new Entry(3.4f,2));

//1
        entries.add(new Entry(4,1));
        entries.add(new Entry(4.8f,1));







        ScatterDataSet dataSet = new ScatterDataSet(entries,"Test Frequency");

        final HashMap<Integer, String> xAxisLabels = new HashMap<>();
        xAxisLabels.put(1,"Dawn");
        xAxisLabels.put(2,"Breakfast");
        xAxisLabels.put(3,"Snack AM");
        xAxisLabels.put(4,"Lunch");
        xAxisLabels.put(5,"Snack PM");
        xAxisLabels.put(6,"Dinner");
        xAxisLabels.put(7,"Snack Eve");
        xAxisLabels.put(8,"Night");



        XAxis xAxis = mChart.getXAxis();
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(true);

        xAxis.setPosition(XAxis.XAxisPosition.TOP);

        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return xAxisLabels.get((int) value);
            }
        });

        ScatterData data = new ScatterData(dataSet);

        mChart.setData(data);

        mChart.invalidate();
//        mChart.setVisibleXRangeMaximum(6);


//SCATTER CLASS
//        mChart.getDescription().setEnabled(false);
//        mChart.setOnChartValueSelectedListener(this);
//
//        mChart.setDrawGridBackground(false);
//        mChart.setTouchEnabled(true);
//        mChart.setMaxHighlightDistance(50f);
//
//        // enable scaling and dragging
//        mChart.setDragEnabled(true);
//        mChart.setScaleEnabled(true);
//
//        mChart.setMaxVisibleValueCount(200);
//        mChart.setPinchZoom(true);
//
//        Legend l = mChart.getLegend();
//        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
//        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
//        l.setOrientation(Legend.LegendOrientation.VERTICAL);
//        l.setDrawInside(false);
//        l.setXOffset(5f);


    }
}
