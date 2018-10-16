package rikkeisoft.nguyenducdung.com.fresherbai3;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import rikkeisoft.nguyenducdung.com.fresherbai3.baitap.activity.LinearActivity;
import rikkeisoft.nguyenducdung.com.fresherbai3.baitap.activity.RelativeActivity;
import rikkeisoft.nguyenducdung.com.fresherbai3.baitap.activity.TableActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnLinear;
    private Button btnRelative;
    private Button btnTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(intent);
            }
        });
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                startActivity(intent);
            }
        });
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void init() {
        btnLinear = findViewById(R.id.btn_linear);
        btnRelative = findViewById(R.id.btn_relative);
        btnTable = findViewById(R.id.btn_table);
    }
}
