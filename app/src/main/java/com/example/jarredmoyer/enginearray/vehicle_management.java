package com.example.jarredmoyer.enginearray;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vehicle_management extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_management);

        configureBackButton();
        configureAddButton();
        configurePrefButton();
        configureMilageInputButton();
        configurePartsButton();
    }
    private void configurepart1(){
        Button part1 = findViewById(R.id.button24);
        part1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(vehicle_management.this, part_management_page.class));
            }
        });
    }
    private void configureBackButton(){
        Button backButton = findViewById(R.id.manage_back);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }

    private void configureAddButton(){
        Button addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(vehicle_management.this, add_vehicle_page.class));
            }
        });
    }

    private void configurePrefButton(){
        Button prefButton = findViewById(R.id.pref_button);
        prefButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(vehicle_management.this, preferences_vehicle_management.class));
            }
        });
    }
    private void configurePartsButton(){
        Button partButton = findViewById(R.id.button28);
        partButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(vehicle_management.this, part_management_page.class));
            }
        });
    }
    private void configureMilageInputButton(){
        Button milageButton = findViewById(R.id.button24);
        milageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(vehicle_management.this, milage_page.class));
            }
        });
    }
}
