package com.example.jarredmoyer.enginearray;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class map_input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.print("Made it to create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_input);

        Button forceUpdate = (Button)findViewById(R.id.button29);
        Button back = (Button)findViewById(R.id.button6);

        forceUpdate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                manual_miles();
            }
        });
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });

    }

    private void back(){


                startActivity(new Intent(map_input.this, vehicle_management.class));
            }


    private void manual_miles(){


                startActivity(new Intent(map_input.this, milage_page.class));

    }
}
