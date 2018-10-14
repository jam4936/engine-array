package com.example.jarredmoyer.enginearray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class login_page extends AppCompatActivity {
    private Button register;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        register = (Button)findViewById(R.id.button2);
        login = (Button)findViewById(R.id.button3);

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openRegistration();
            }
        });

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                login();
            }
        });
    }

    public void openRegistration(){
        Intent intent = new Intent(this, registration_login.class);
        startActivity(intent);
    }
    public void login(){
        Intent intent = new Intent(this, vehicle_management.class);
        startActivity(intent);
    }

}
