package com.example.afisher.chartandgraphs;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class PieChartEZ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart_ez);

        PieChart ezAsPie = (PieChart) findViewById(R.id.piechart);

        ezAsPie.addPieSlice(new PieModel("<=50", 10, Color.parseColor("#3F51B5")));
        ezAsPie.addPieSlice(new PieModel("51-75", 21, Color.parseColor("#2196F3")));
        ezAsPie.addPieSlice(new PieModel("76-124", 41, Color.parseColor("#4CAF50")));
        ezAsPie.addPieSlice(new PieModel("125-199", 13, Color.parseColor("#F44336")));
        ezAsPie.addPieSlice(new PieModel(">=200", 15, Color.parseColor("#D50000")));

//        ezAsPie.setValueTextColor(R.color.white);
//        ezAsPie.setValueTextSize(15);








//        String hypoGlyc = "<=50"; // 10
//        String lowGylc = "51-75"; // 21
//        String stable = "76-124"; // 41
//        String highGlyc = "125-199"; // 13
//        String hyperGlyc = ">=200"; //15
    }
}
