package com.example.jarredmoyer.enginearray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class registration_login extends AppCompatActivity {
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_login);
        register = (Button)findViewById(R.id.past_int);
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
    public void reg(){
        Intent intent = new Intent(this,login_page.class);
        startActivity(intent);
    }
}
