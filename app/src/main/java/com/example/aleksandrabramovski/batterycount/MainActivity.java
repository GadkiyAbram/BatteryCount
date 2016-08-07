package com.example.aleksandrabramovski.batterycount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mBatteryCountToZeroUsed;
    private Button mBatteryCountUsed;
    private Button mBatteryCountToZeroNew;
    private Button mBatteryCountNew;
    private Button mResetAll;
    private int mBatCountNew = 0;
    private int mBatCountUsed = 0;
    private TextView mBatteryCNew;
    private TextView mBatteryCUsed;
    private Button mMinusNew;
    private Button mMinusUsed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBatteryCountNew = (Button)findViewById(R.id.buttonBC);
        mBatteryCountToZeroNew = (Button)findViewById(R.id.buttonTZNew);
        mBatteryCountUsed = (Button)findViewById(R.id.buttonUB);
        mBatteryCountToZeroUsed = (Button)findViewById(R.id.buttonTZUsed);
        mBatteryCNew = (TextView)findViewById(R.id.textViewNB);
        mBatteryCUsed = (TextView)findViewById(R.id.textViewUB);
        mResetAll = (Button)findViewById(R.id.resetALL);
        mMinusNew = (Button)findViewById(R.id.minusNew);
        mMinusUsed = (Button)findViewById(R.id.minusUsed);
        mBatteryCNew.setText(" " + mBatCountNew);
        mBatteryCUsed.setText(" " + mBatCountUsed);
    }

    public void onClick(View view) {
        mBatteryCountNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBatteryCNew.setText(" " + ++mBatCountNew);
            }
        });
        mBatteryCountToZeroNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBatCountNew = 0;
                mBatteryCNew.setText(" " + mBatCountNew);
            }
        });
        mBatteryCountUsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBatteryCUsed.setText(" " + ++mBatCountUsed);
            }
        });
        mBatteryCountToZeroUsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBatCountUsed = 0;
                mBatteryCUsed.setText(" " + mBatCountUsed);

            }
        });
        mResetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBatCountNew = 0;
                mBatCountUsed = 0;
                mBatteryCNew.setText(" " + mBatCountNew);
                mBatteryCUsed.setText(" " + mBatCountUsed);
            }
        });
        mMinusNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBatteryCNew.setText(" " + --mBatCountNew);
            }
        });
        mMinusUsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBatteryCUsed.setText(" " + --mBatCountUsed);
            }
        });
    }
}
