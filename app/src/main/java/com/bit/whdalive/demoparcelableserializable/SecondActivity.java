package com.bit.whdalive.demoparcelableserializable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.my_serial_data);
        Book book = (Book) getIntent().getSerializableExtra("key1");
        textView.setText(String.format("Name is: %s, Price is:%d",book.getName(),book.getPrice()));
    }
}
