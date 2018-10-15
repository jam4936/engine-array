package com.example.jarredmoyer.enginearray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class maintance_page extends AppCompatActivity {
    private Button back;
    private Button nextInt;
    private Button pastInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintance_page);

        back = (Button)findViewById(R.id.button13);
        nextInt = (Button)findViewById(R.id.manage_back);
        pastInt = (Button)findViewById(R.id.past_int);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goBack();
            }
        });
        nextInt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                next();
            }
        });
        pastInt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                past();
            }
        });
    }

    public void goBack(){
        Intent intent = new Intent(maintance_page.this,part_management_page.class);
        startActivity(intent);
    }

    public void next(){
        //Alter colored buttons to show future part status
    }

    public void past(){
        //Alter colored buttons to show past part status
    }
}

