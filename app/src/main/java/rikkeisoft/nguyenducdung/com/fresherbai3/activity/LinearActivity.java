package rikkeisoft.nguyenducdung.com.fresherbai3.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import rikkeisoft.nguyenducdung.com.fresherbai3.R;

public class LinearActivity extends AppCompatActivity {
    private Button btnSetColor;
    private Button btnCancel;
    private RadioButton rbRed, rbWhite, rbBlue;
    private TextView tvShowColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        init();
        btnSetColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbBlue.isChecked()){
                    tvShowColor.setBackgroundColor(Color.BLUE);
                }else if (rbRed.isChecked()){
                    tvShowColor.setBackgroundColor(Color.RED);
                }else if (rbWhite.isChecked()){
                    tvShowColor.setBackgroundColor(Color.WHITE);
                }
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShowColor.setBackgroundColor(Color.WHITE);
            }
        });

    }

    private void init() {
        btnSetColor = (Button) findViewById(R.id.btn_set_color);
        btnCancel = (Button) findViewById(R.id.btn_cancel);
        rbRed = (RadioButton) findViewById(R.id.rb_red);
        rbBlue = (RadioButton) findViewById(R.id.rb_blue);
        rbWhite = (RadioButton) findViewById(R.id.rb_white);
        tvShowColor = (TextView) findViewById(R.id.tv_show_color);
    }
}
