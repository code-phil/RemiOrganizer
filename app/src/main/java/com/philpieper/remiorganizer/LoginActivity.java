package com.philpieper.remiorganizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    final String prefNameIsLoggedIn = "isLoggedIn";
    final String prefNameAdminAccountEmail = "adminAccountEmail";
    final String prefNameAdminAccountPassword = "adminAccountPassword";
    final String prefNameUserEmail = "userEmail";

    ImageView ivBackToMain;
    EditText etEmail;
    EditText etPassword;
    Button butLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Digusting Android Zeug entfernen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_login);

        //Edit Texts
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        //Back Button
        ivBackToMain = findViewById(R.id.ivBackToMain);

        ivBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Login Button
        butLogin = findViewById(R.id.butLoginSecond);

        butLogin.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etEmail.getText().toString() != null){if (etEmail.getText().toString().equals("admin")){
                    SharedPreferences preferences = getSharedPreferences(prefNameAdminAccountPassword, MODE_PRIVATE);
                    SharedPreferences preferences2 = getSharedPreferences(prefNameUserEmail, MODE_PRIVATE);
                    Log.d("debug1", "am here1");
                    String password = preferences.getString(prefNameAdminAccountPassword, "");

                    if(etPassword.getText().toString() != null){if(password.equals(etPassword.getText().toString())){
                        Log.d("debug2", "am here2");
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putBoolean(prefNameIsLoggedIn, true);
                        editor.putString(prefNameUserEmail, "admin");
                        editor.commit();

                        Intent intent = new Intent(LoginActivity.this, Dashbord.class);
                        startActivity(intent);
                    }}
                }}
            }
        }));

    }
}