package com.philpieper.remiorganizer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TimetableFreitagActivity extends AppCompatActivity{

    TextView tvDay;
    TextView firstLine735;
    TextView firstLine930;
    TextView firstLine1105;
    TextView firstLine1205;
    TextView firstLine1305;
    TextView firstLine1445;

    ImageView ivBackToDashboard;
    ImageView ivToMontag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Digusting Android Zeug entfernen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_freitag_timetable);

        //Back Button
        ivBackToDashboard = findViewById(R.id.ivBackToDashboard);

        ivBackToDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Weiter Button
        ivToMontag = findViewById(R.id.ivToMontag);
        ivToMontag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimetableFreitagActivity.this, TimetableMontagActivity.class);
                startActivity(intent);
            }
        });

        //Timetable TextViews

        firstLine735 = findViewById(R.id.tvFirstLine735);
        firstLine735.setText(getDataFromDatabase(0));

        firstLine930 = findViewById(R.id.firstLine930);
        firstLine930.setText(getDataFromDatabase(1));

        firstLine1105 = findViewById(R.id.firstLine1105);
        firstLine1105.setText(getDataFromDatabase(2));

        firstLine1205 = findViewById(R.id.firstLine1205);
        firstLine1205.setText(getDataFromDatabase(3));

        firstLine1305  = findViewById(R.id.firstLine1305);
        firstLine1305.setText(getDataFromDatabase(4));

        firstLine1445 = findViewById(R.id.firstLine1445);
        firstLine1445.setText(getDataFromDatabase(5));

    }

    public String getDataFromDatabase(int pStundenIndex){
        String defaultReturn = "Default";

        //SELECT FROM Fach, Raum WHERE id==pStundenIndex

        return defaultReturn;
    }
}