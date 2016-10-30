package com.aykuttasil.percentbarapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aykuttasil.percentbar.PercentBarView;
import com.aykuttasil.percentbar.models.BarImageModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    PercentBarView percentBarView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        percentBarView = (PercentBarView) findViewById(R.id.PercentBarView);

        percentBarView.setRightValue(60);
        percentBarView.setLeftValue(40);

        percentBarView.setTitleList("X List");
        percentBarView.setRightBarColor(Color.MAGENTA);


        percentBarView.showResult();

    }


}
