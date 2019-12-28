package com.example.swt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class reg extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();
        myRef.setValue("Hello, World!");
    }
}
