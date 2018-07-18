package com.example.jerry.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NormalActivity extends AppCompatActivity {
    private static final String TAG = "NormalActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
        Intent intent = getIntent();
        Bundle tempdata = intent.getBundleExtra("temp_data");
        if (tempdata != null){
            String string = tempdata.getString("data_key");
            Log.d(TAG, string);
        }
        else {
            Log.d(TAG, "Empty");
        }
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NormalActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
