package com.example.afisher.chartandgraphs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button logBook;
    Button pieChartMP;
    Button pieChartEZ;
    Button barGraph;
    Button bgLevels;
    Button insulinDeliveryGraph;
    Button insulinDeliveryGraphMP;
    Button logBookTableLayout;
    Button testFrequencyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logBook = (Button) findViewById(R.id.logBook);
        pieChartMP = (Button) findViewById(R.id.pieChartMP);
        pieChartEZ= (Button) findViewById(R.id.pieChartEZ);
        barGraph = (Button) findViewById(R.id.barGraph);
        bgLevels= (Button) findViewById(R.id.carePlanBGLevelsEZ);
        insulinDeliveryGraph = (Button) findViewById(R.id.insulinDeliveryGraphEz);
        insulinDeliveryGraphMP = (Button) findViewById(R.id.insulinDeliveryGraphMP);
        logBookTableLayout = (Button) findViewById(R.id.tableLayout);
        testFrequencyButton= (Button) findViewById(R.id.testFreqBtn);


        logBook.setOnClickListener(this);
        pieChartMP.setOnClickListener(this);
        pieChartEZ.setOnClickListener(this);
        barGraph.setOnClickListener(this);
        bgLevels.setOnClickListener(this);
        insulinDeliveryGraph.setOnClickListener(this);
        insulinDeliveryGraphMP.setOnClickListener(this);
        logBookTableLayout.setOnClickListener(this);
        testFrequencyButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if( v == logBook){
            intent = new Intent(this, LogBook.class);
        }else if (v == pieChartMP){
            intent = new Intent(this, PieChartMP.class);
        }else if (v == pieChartEZ){
            intent = new Intent(this, PieChartEZ.class);
        }else if (v == barGraph){
            intent = new Intent(this, BarGraph.class);
        }else if (v == bgLevels){
            intent = new Intent(this, BGLevels.class);
        }else if (v == insulinDeliveryGraph){
            intent = new Intent(this, InsulinDelivery.class);
        }else if(v == insulinDeliveryGraphMP){
            intent = new Intent(this,InsulinDeliveryMP.class);
        }else if (v == logBookTableLayout){
            intent = new Intent(this, LogBookTableLayout.class);
        }else if (v == testFrequencyButton){
            intent = new Intent(this, TestFrequency.class);
        }
        if(intent != null){
            startActivity(intent);
        }

    }
}
