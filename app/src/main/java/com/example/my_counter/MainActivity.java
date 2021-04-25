package com.example.my_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.my_counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
        private int qty = 0;
        ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        setupEventHandlers();
    }

    private void setupEventHandlers() {
        b.incBtn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                incQty();
            }
        });

        b.incBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                decQty();
            }
        });
    }

    public void decQty() {
        qty--;
        b.qty.setText("" + qty);
    }

    public void incQty() {
        qty++;
        b.qty.setText("" + qty);
    }
}