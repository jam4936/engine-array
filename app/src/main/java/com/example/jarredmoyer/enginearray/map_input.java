package com.example.jarredmoyer.enginearray;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class map_input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_input);

        back();
        manual_miles();

    }

    private void back(){
        Button part1 = findViewById(R.id.button28);
        part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(map_input.this, vehicle_management.class));
            }
        }

        );



    }

    private void manual_miles(){
        Button part1 = findViewById(R.id.button28);
        part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(map_input.this, milage_page.class));
            }
        });
    }
}
