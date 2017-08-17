package com.example.afisher.chartandgraphs;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;

import java.util.ArrayList;
import java.util.List;

public class PieChartMP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart_mp);
//setWordWrapEnabled

        PieChart pChart = (PieChart) findViewById(R.id.pieChartMP);
        pChart.setDrawEntryLabels(false);
//        pChart.setHoleRadius(0); //inner hole radius
//        pChart.setTransparentCircleRadius(25); //transparent circle that gives a 3d esque effect
        pChart.getDescription().setEnabled(false);
        pChart.setRotationEnabled(false);
        pChart.setHighlightPerTapEnabled(true); // if user can click on it

        String hypoGlyc = "<=50"; // 10.7
        String lowGylc = "51-75"; // 21.5
        String stable = "76-124"; // 39.1
        String highGlyc = "125-199"; // 13.3
        String hyperGlyc = ">=200"; //15.4

        List<PieEntry> values = new ArrayList<>();

        values.add(new PieEntry(10.7f, hypoGlyc));
        values.add(new PieEntry(21.5f, lowGylc));
        values.add(new PieEntry(39.1f, stable));
        values.add(new PieEntry(13.3f, highGlyc));
        values.add(new PieEntry(15.4f, hyperGlyc));




        pChart.setMaxHighlightDistance(50);





        PieDataSet chart = new PieDataSet(values,"");
        chart.setColors(new int[]{R.color.hypo,R.color.low, R.color.stable, R.color.high, R.color.hyper}, this);
//        chart.setSelectionShift(40); //minimizes size
        chart.setSliceSpace(1);

        Legend legend = pChart.getLegend();
//        legend.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
//        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);//Legend.LegendHorizontalAlignment.RIGHT
//        legend.setOrientation(Legend.LegendOrientation.VERTICAL);
        legend.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);//Legend.LegendHorizontalAlignment.RIGHT
        legend.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        legend.setFormSize(15);
        legend.setForm(Legend.LegendForm.CIRCLE);
        legend.setTextSize(13);
        legend.setDrawInside(false);


        PieData data = new PieData(chart);
        data.setValueFormatter(new PercentFormatter()); //this will show percentage
        data.setValueTextSize(15);
        data.setValueTextColor(Color.WHITE);


        pChart.setData(data);
        pChart.invalidate();

    }
}
