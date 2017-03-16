package com.example.android.localbird;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Divyani on 16-03-2017.
 */
public class AskLocation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asklocation);
        //Welcome Page
    }
    public void surat(View v)
    {
        Intent i=new Intent(this,Categories.class);
        startActivity(i);
    }
    public void mumbai(View v)
    {
        Intent i=new Intent(this,Categories.class);
        startActivity(i);
    }

}
