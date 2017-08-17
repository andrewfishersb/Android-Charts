package com.example.afisher.chartandgraphs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsulinDeliveryMP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insulin_delivery_mp);

        BarChart bChart = (BarChart) findViewById(R.id.stackedMP);
        bChart.getDescription().setEnabled(false);
        bChart.setPinchZoom(false);
        bChart.setDrawGridBackground(false);
        bChart.setDrawBarShadow(false);
//        bChart.setHorizontalScrollBarEnabled(true);


        Legend legend = bChart.getLegend();
        legend.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);



        final ArrayList<String> xAxisLabels = new ArrayList<>(Arrays.asList("3/2","3/3","3/4","3/5","3/6","3/7","3/8","3/9","3/10","3/11","3/12","3/13","3/14"));


        XAxis xAxis = bChart.getXAxis();
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);

//        xAxis.setAxisMinimum(0);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM_INSIDE);
        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return xAxisLabels.get((int) value);
            }
        });

        xAxis.setTextSize(12);

        YAxis yAxis = bChart.getAxisLeft();
        yAxis.setDrawAxisLine(false);




        List<BarEntry> entries = new ArrayList<>();

        BarEntry marchSecond = new BarEntry(0f, new float[]{29.25f,26.40f});
        BarEntry marchThird = new BarEntry(1f, new float[]{25.30f,24.40f});
        BarEntry marchFourth = new BarEntry(2f, new float[]{24.55f,27.55f});
        BarEntry marchFifth = new BarEntry(3f, new float[]{29.25f,31.35f});
        BarEntry marchSixth = new BarEntry(4f, new float[]{28.75f,25.55f});
        BarEntry marchSeventh = new BarEntry(5f, new float[]{29.25f,23.40f});
        BarEntry marchEighth = new BarEntry(6f, new float[]{29.25f,19.85f});

        BarEntry marchNinth = new BarEntry(7f, new float[]{29.25f,34f});
        BarEntry marchTenth = new BarEntry(8f, new float[]{27.6f,33.65f});
        BarEntry marchEleventh = new BarEntry(9f, new float[]{29.25f,25.9f});
        BarEntry marchTwelfth = new BarEntry(10f, new float[]{29.25f,33.15f});
        BarEntry marchThirteenth = new BarEntry(11f, new float[]{29.1f,27.7f});
        BarEntry marchFourteenth = new BarEntry(12f, new float[]{29.25f,30f});

        entries.add(marchSecond);
        entries.add(marchThird);
        entries.add(marchFourth);
        entries.add(marchFifth);
        entries.add(marchSixth);
        entries.add(marchSeventh);
        entries.add(marchEighth);

        entries.add(marchNinth);
        entries.add(marchTenth);
        entries.add(marchEleventh);
        entries.add(marchTwelfth);
        entries.add(marchThirteenth);
        entries.add(marchFourteenth);

        bChart.getAxisRight().setEnabled(false);

        BarDataSet dataSet = new BarDataSet(entries,"");
        dataSet.setColors(new int[]{R.color.basal,R.color.bolus}, this);
        dataSet.setStackLabels(new String[] {"Basal (U)","Bolus (U)"});
        dataSet.setValueTextSize(12);

        BarData data = new BarData(dataSet);

        data.setBarWidth(.9f);

        bChart.setData(data);

//        bChart.setFitBars(true);

        bChart.invalidate();
        bChart.setVisibleXRangeMaximum(6);

        //Put label on y axis
    }
}
