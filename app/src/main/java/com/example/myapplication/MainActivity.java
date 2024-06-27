package com.example.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    DatePicker picker;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    picker=findViewById(R.id.date);
    btn=findViewById(R.id.datebtn);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          int year=  picker.getYear();
           int month= picker.getMonth()+1;
           int date=picker.getDayOfMonth();
 Toast.makeText(MainActivity.this, date+" : "+month+" : "+year, Toast.LENGTH_SHORT).show();
        }
    });
       }
}
