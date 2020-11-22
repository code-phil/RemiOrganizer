package com.philpieper.remiorganizer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.philpieper.remiorganizer.databinding.ActivityDashbordBinding;

import java.util.Date;

public class DashbordActivity extends AppCompatActivity {

    private ActivityDashbordBinding binding;

    ImageView ivStundenplan;
    int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //Digusting Android Zeug entfernen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();

        binding = ActivityDashbordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle("Dashboard");

        //getDay
        day = new Date().getDay();

        ivStundenplan = findViewById(R.id.ivStundenplan);

        ivStundenplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToTimetableDay(day);

            }
        });


    }
    public void goToTimetableDay(int pDay){
        switch(pDay){
            case 2:
                Intent intent1 = new Intent(DashbordActivity.this, TimetableDienstagActivity.class);
                startActivity(intent1);
                break;

            case 3:
                Intent intent2 = new Intent(DashbordActivity.this, TimetableMittwochActivity.class);
                startActivity(intent2);
                break;

            case 4:
                Intent intent3 = new Intent(DashbordActivity.this, TimetableDonnerstagActivity.class);
                startActivity(intent3);
                break;

            case 5:
                Intent intent4 = new Intent(DashbordActivity.this, TimetableFreitagActivity.class);
                startActivity(intent4);
                break;

            default:
                Intent intent5 = new Intent(DashbordActivity.this, TimetableMontagActivity.class);
                startActivity(intent5);
                break;
        }
    }

}