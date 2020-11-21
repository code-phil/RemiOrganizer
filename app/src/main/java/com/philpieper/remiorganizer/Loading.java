package com.philpieper.remiorganizer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Loading extends AppCompatActivity {

    final String prefNameIsLoggedIn = "isLoggedIn";
    final String prefNameAdminAccountEmail = "adminAccountEmail";
    final String prefNameAdminAccountPassword = "adminAccountPassword";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Digusting Android Zeug entfernen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();

        setContentView(R.layout.activity_loading);

        createAdminAccount();

        Intent intent = new Intent(Loading.this, MainActivity.class);
        startActivity(intent);



    }

    public void createAdminAccount(){
        SharedPreferences preferences = getSharedPreferences(prefNameIsLoggedIn, MODE_PRIVATE);
        SharedPreferences preferences2 = getSharedPreferences(prefNameAdminAccountPassword, MODE_PRIVATE);

        //Objekt in den App Daten auf dem Handy editieren
        SharedPreferences.Editor editor = preferences.edit();
        SharedPreferences.Editor editor2 = preferences2.edit();
        editor.putString(prefNameAdminAccountEmail, "admin");
        editor2.putString(prefNameAdminAccountPassword, "Remi2020");
        editor.commit();
        editor2.commit();
    }
}