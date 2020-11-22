package com.philpieper.remiorganizer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TimetableMontagActivity extends AppCompatActivity{

    Boolean langeSchuleAnDiesemTag89 = true;
    Boolean langeSchuleAnDiesemTag1011 = false;

    Reader reader = new Reader();

    TextView firstLine735;
    TextView firstLine930;
    TextView firstLine1105;
    TextView firstLine1205;
    TextView firstLine1305;
    TextView firstLine1445;
    TextView tvTime1305;
    TextView tvTime1445;

    ImageView ivBackToDashboard;
    ImageView ivToDienstag;
    ImageView iv1305;
    ImageView ivZeit1305;
    ImageView ivOutline1305;
    ImageView iv1445;
    ImageView ivZeit1445;
    ImageView ivOutline1445;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Digusting Android Zeug entfernen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_montag_timetable);

        //Back Button
        ivBackToDashboard = findViewById(R.id.ivBackToDashboard);

        ivBackToDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Weiter Button
        ivToDienstag = findViewById(R.id.ivToDienstag);
        ivToDienstag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimetableMontagActivity.this, TimetableDienstagActivity.class);
                startActivity(intent);
            }
        });

        //lange Schule visibility
        iv1305 = findViewById(R.id.iv1305);
        ivZeit1305 = findViewById(R.id.ivZeit1305);
        ivOutline1305 = findViewById(R.id.ivOutline1305);
        tvTime1305 = findViewById(R.id.time1305);
        iv1445 = findViewById(R.id.iv1445);
        ivZeit1445 = findViewById(R.id.ivZeit1445);
        ivOutline1445 = findViewById(R.id.ivOutline1445);
        tvTime1445 = findViewById(R.id.time1445);

        //Timetable TextViews

        firstLine735 = findViewById(R.id.tvFirstLine735);
        firstLine735.setText(getDataFromDatabase(0));

        firstLine930 = findViewById(R.id.firstLine930);
        firstLine930.setText(getDataFromDatabase(1));

        firstLine1105 = findViewById(R.id.firstLine1105);
        firstLine1105.setText(getDataFromDatabase(2));

        firstLine1205 = findViewById(R.id.firstLine1205);
        firstLine1205.setText(getDataFromDatabase(3));

        if(langeSchuleAnDiesemTag89){
            iv1305.setVisibility(View.VISIBLE);
            ivZeit1305.setVisibility(View.VISIBLE);
            ivOutline1305.setVisibility(View.VISIBLE);
            tvTime1305.setVisibility(View.VISIBLE);

            firstLine1305  = findViewById(R.id.firstLine1305);
            firstLine1305.setText(getDataFromDatabase(4));
            if(langeSchuleAnDiesemTag1011){
                iv1445.setVisibility(View.VISIBLE);
                ivZeit1445.setVisibility(View.VISIBLE);
                ivOutline1445.setVisibility(View.VISIBLE);
                tvTime1445.setVisibility(View.VISIBLE);

                firstLine1445 = findViewById(R.id.firstLine1445);
                firstLine1445.setText(getDataFromDatabase(5));
            }
        }

    }

    public String getDataFromDatabase(int pStundenIndex){



        //SELECT FROM Fach, Raum WHERE id==pStundenIndex

        return reader.readDataStundenplan(pStundenIndex,0,0);
    }
}