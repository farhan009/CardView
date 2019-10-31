package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.MissingFormatArgumentException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView schoolCardView, hospitalCardView, airportCardView, restaurantCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        schoolCardView = findViewById(R.id.school_CardView_id);
        hospitalCardView = findViewById(R.id.hospital_CardView_id);
        airportCardView = findViewById(R.id.airport_CardView_id);
        restaurantCardView = findViewById(R.id.restaurant_CardView_id);

        schoolCardView.setOnClickListener(this);
        schoolCardView.setOnClickListener(this);
        airportCardView.setOnClickListener(this);
        restaurantCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.school_CardView_id){
            Intent intent = new Intent(MainActivity.this, SchoolActivity.class);
            intent.putExtra("key", "Welcome to our School");
            startActivity(intent);
        }
        else if (v.getId() == R.id.hospital_CardView_id) {
            Intent intent = new Intent(MainActivity.this, HospitalActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.airport_CardView_id){
            Intent intent = new Intent(MainActivity.this, SchoolActivity.class);
            intent.putExtra("key", "Welcome to our Airport");
            startActivity(intent);
        }
        else if (v.getId() == R.id.restaurant_CardView_id){
            Intent intent = new Intent(MainActivity.this, SchoolActivity.class);
            intent.putExtra("key", "Welcome to our Restaurant");
            startActivity(intent);
        }

    }
}
