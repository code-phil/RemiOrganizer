package com.philpieper.remiorganizer;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class Timetable extends AppCompatActivity implements AdapterView.OnItemClickListener{

    TextView tvDay;
    TextView firstLine735;
    TextView firstLine930;
    TextView firstLine1105;
    TextView firstLine1205;
    TextView firstLine1305;
    TextView firstLine1445;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Digusting Android Zeug entfernen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_timetable);

        //Day-Title
        tvDay = findViewById(R.id.tvDay);
        setDay(tvDay);

        //Timetable TextViews

        firstLine735 = findViewById(R.id.tvFirstLine735);
        firstLine930.setText(getDataFromDatabase(0));

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

    public void setDay(TextView tvDay){
        int date = new Date().getDay();
        String day = "";

        switch(date){
            case 2:
                day = "Dienstag";
                break;
            case 3:
                day = "Mittwoch";
                break;
            case 4:
                day = "Donnerstag";
                break;
            case 5:
                day = "Freitag";
                break;
            default:
                day = "Montag";
                break;
        }

        tvDay.setText(day);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    public String getDataFromDatabase(int pStundenIndex){
        String defaultReturn = "Default";

        //SELECT FROM Fach, Raum WHERE id==pStundenIndex

        return defaultReturn;
    }
}