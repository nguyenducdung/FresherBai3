package rikkeisoft.nguyenducdung.com.fresherbai3.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import rikkeisoft.nguyenducdung.com.fresherbai3.R;

public class TableActivity extends AppCompatActivity {
    private Button btnColor1;
    private Button btnColor2;
    private Button btnColor3;
    private Button btnClear;
    private TextView tvShow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        init();
        btnColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor1.setForeground(getDrawable(R.drawable.fg_red));
                tvShow.setBackgroundColor(Color.RED);
            }
        });
        btnColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor2.setForeground(getDrawable(R.drawable.fg_yellow));
                tvShow.setBackgroundColor(Color.YELLOW);
            }
        });
        btnColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor3.setForeground(getDrawable(R.drawable.fg_blue));
                tvShow.setBackgroundColor(Color.BLUE);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShow.setBackgroundColor(Color.WHITE);
            }
        });
    }

    private void init() {
        btnColor1 = findViewById(R.id.btn_color_01);
        btnColor2 = findViewById(R.id.btn_color_02);
        btnColor3 = findViewById(R.id.btn_color_03);
        btnClear = findViewById(R.id.btn_clear);
        tvShow = findViewById(R.id.tv_color_table);
    }
}
