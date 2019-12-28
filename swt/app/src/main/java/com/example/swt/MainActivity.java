package com.example.swt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reg(View view) {
        Intent i=new Intent(this,reg.class);
        startActivity(i);
    }

    public void ser(View view) {
        Intent i=new Intent(this,ser.class);
        startActivity(i);
    }

    public void upd(View view) {
        Intent i=new Intent(this,upd.class);
        startActivity(i);
    }

    public void sho(View view) {
        Intent i=new Intent(this,sho.class);
        startActivity(i);
    }

    public void del(View view) {
        Intent i=new Intent(this,del.class);
        startActivity(i);
    }
}
