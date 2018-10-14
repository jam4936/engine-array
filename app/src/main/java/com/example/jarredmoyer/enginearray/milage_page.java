package com.example.jarredmoyer.enginearray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

//RETURNS TO VEHICLE MANAGEMENT
public class milage_page extends AppCompatActivity {
    private Button update;
    private Button back;
    // 15 update 7 back
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milage_page);
        update = (Button)findViewById(R.id.button15);
        back = (Button)findViewById(R.id.button4);

        update.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                update();
            }
        });
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                back();
            }
        });


    }
    public void update(){
        Intent intent = new Intent(this,vehicle_management.class);
        startActivity(intent);
    }
    public void back(){
        Intent intent = new Intent(this,vehicle_management.class);
        startActivity(intent);
    }

}

