package com.example.afisher.chartandgraphs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BarGraph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_graph);

        BarChart bChart = (BarChart) findViewById(R.id.barChart);
        bChart.getDescription().setEnabled(false);
        bChart.setPinchZoom(false);
        bChart.setDrawGridBackground(false);
        bChart.setDrawBarShadow(false);




        String hypoGlyc = "<=50"; // 10.7
        String lowGylc = "51-75"; // 21.5
        String stable = "76-124"; // 39.1
        String highGlyc = "125-199"; // 13.3
        String hyperGlyc = ">=200"; //15.4

        bChart.getLegend().setEnabled(false); //hides legend
        //Might not need
//        Legend l = bChart.getLegend();
//        l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
//        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
//        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
//        l.setTextSize(8f);

//        final ArrayList<String> labels = new ArrayList<String>(Arrays.asList("Hypoglycemic","Below Target","On Target", "Above Target","Hyperglycemic"));
        final ArrayList<String> labels = new ArrayList<String>(Arrays.asList(hypoGlyc,lowGylc,stable, highGlyc,hyperGlyc));

//        //X Axis formatting
        XAxis xAxis = bChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return labels.get((int) value);
            }
        });


        bChart.getAxisRight().setEnabled(false);

        List<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0f, 10.7f));
        entries.add(new BarEntry(1f, 21.5f));
        entries.add(new BarEntry(2f, 39.1f));
        entries.add(new BarEntry(3f, 13.3f));
        entries.add(new BarEntry(4f, 15.4f));

        BarDataSet dataSet = new BarDataSet(entries,"");
        dataSet.setColors(new int[]{R.color.hypo,R.color.low, R.color.stable, R.color.high, R.color.hyper}, this);
        BarData data = new BarData(dataSet);
        data.setBarWidth(0.9f);

        bChart.setData(data);
        bChart.setFitBars(true);
        bChart.invalidate();

        //Remove values at top of each bar...or turn them into percentiles
        //Edit the Y Axis to represent the same data
        //Prevent motion events
        //Get rid of color boxes at the bottom of the page


    }
}
