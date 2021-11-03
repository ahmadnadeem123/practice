package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxDone, checkBoxPending, checkBoxRead;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxDone = findViewById(R.id.checkBoxDone);
        t1=findViewById(R.id.t1);
        checkBoxDone.setOnClickListener(this::onClick);

    }


    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.checkBoxDone:
                if (checkBoxDone.isChecked())
                    t1.setText("Check Box Done");
                break;

        }
    }
}

