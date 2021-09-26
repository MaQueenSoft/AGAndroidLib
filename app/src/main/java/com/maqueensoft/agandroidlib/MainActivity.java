package com.maqueensoft.agandroidlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.agandroidlib.R;
import com.maqueensoft.aglib.Toaster;
//import com.maqueensoft.aglib.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Test
        Toaster.agToastLong(getApplicationContext(), "This message is from Atrangi Games Lib");

    }
}