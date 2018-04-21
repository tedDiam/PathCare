package com.example.edacy.pathcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class PregFollowActivity extends AppCompatActivity {
   Button consul, vac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preg_follow);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);

        consul =(Button) findViewById(R.id.consult);
        vac =(Button) findViewById(R.id.vac);

        consul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PregFollowActivity.this,  ConsulActivity.class);
                startActivity(intent);
            }
        });
        vac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PregFollowActivity.this,  VaccinActivity.class);
                startActivity(intent);
            }
        });
    }
}
