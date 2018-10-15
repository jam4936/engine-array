package com.example.jarredmoyer.enginearray;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class parts_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts_page);

        configureBackButton();
        configureNextButton();
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

    private void configureNextButton(){
        Button nextButton = findViewById(R.id.past_int);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(parts_page.this, part_management_page.class));
            }
        });
    }
}
