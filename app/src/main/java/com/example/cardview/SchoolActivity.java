package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SchoolActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_school);

        textView = findViewById(R.id.textView_id);
        Bundle bundle =  getIntent().getExtras();

        if (bundle != null){
            String value = bundle.getString("key");
            textView.setText(value);
        }
    }
}
