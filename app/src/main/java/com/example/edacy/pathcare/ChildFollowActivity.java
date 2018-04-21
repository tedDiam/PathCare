package com.example.edacy.pathcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class ChildFollowActivity extends AppCompatActivity {
    Button pt, vacc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_follow);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);

        pt =(Button) findViewById(R.id.poid);
        vacc =(Button) findViewById(R.id.vaccin);

        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChildFollowActivity.this,  PoidActivity.class);
                startActivity(intent);
            }
        });
        vacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChildFollowActivity.this,  VaccinActivity.class);
                startActivity(intent);
            }
        });

    }
}
