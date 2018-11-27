package com.example.jarredmoyer.enginearray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class preferences_vehicle_management extends AppCompatActivity {
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences_vehicle_management);
        back = (Button)findViewById(R.id.button2);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });

    }
    public void exit(){
        Intent intent = new Intent(this,vehicle_management.class);
        startActivity(intent);
    }
}
