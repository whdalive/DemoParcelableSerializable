package com.bit.whdalive.demoparcelableserializable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start_serial).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                Book book = new Book("Android 开发艺术探索",50);
                intent.putExtra("key1",book);
                startActivity(intent);
            }
        });
        findViewById(R.id.start_parcel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ThreeActivity.class);
                People people = new People();
                people.setName("whdalive");
                people.setSex("man");
                people.setAge(21);
                intent.putExtra("key2",people);
                startActivity(intent);
            }
        });
    }
}
