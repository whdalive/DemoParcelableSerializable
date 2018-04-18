package com.bit.whdalive.demoparcelableserializable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        TextView textView = findViewById(R.id.my_parcel_data);
        People people = (People) getIntent().getParcelableExtra("key2");
        textView.setText(String.format("Name is : %s, Sex is : %s, Age is: %d",people.getName(),people.getSex(),people.getAge()));

    }
}
