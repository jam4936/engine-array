package com.example.jarredmoyer.enginearray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class part_management_page extends AppCompatActivity {
    // 13 for changing, 14 for exit
    private Button changePart;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_management_page);
        changePart = (Button)findViewById(R.id.button13);
        back = (Button)findViewById(R.id.button14);


        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                leave();
            }
        });
        changePart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                change();
            }
        });
    }
    public void change(){
        Intent intent = new Intent(this,part_management_page.class);
        startActivity(intent);
    }
    public void leave(){
        Intent intent = new Intent(this,vehicle_management.class);
        startActivity(intent);
    }
}
