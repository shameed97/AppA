package com.example.appa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void senddata(View view) {
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        Intent intent1=Intent.createChooser(intent,"Please choose one");
        intent.putExtra("shameed","hi this is shagul");
        startActivity(intent);

    if (intent.resolveActivity(getPackageManager())!=null){
        startActivity(intent1);
    }
    }

}
