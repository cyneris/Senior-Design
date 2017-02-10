package com.example.tbecker012.soccermomsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RosterPageActivity extends AppCompatActivity implements EditText.OnClickListener{
    public Button hb, ub, cb1;
    public EditText nf1, nf2;
    public Spinner ps1, ps2, ps3, ps4, ps5, ps6, ps7, ps8, ps9, ps10, ps11, ps12, ps13, ps14, ps15, ps16, ps17, ps18, ps19, ps20, ps21, ps22, ps23, ps24, ps25, ps26, ps27, ps28, ps29, ps30, ps31, ps32, ps33, ps34, ps35, ps36, ps37, ps38, ps39, ps40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roster_page);
        init();
    }

    public void init(){
        hb = (Button) findViewById(R.id.homeButton);
        ub = (Button) findViewById(R.id.updateButton);
        cb1 = (Button) findViewById(R.id.clearButton1);

        nf1 = (EditText) findViewById(R.id.nameField1);
        nf2 = (EditText) findViewById(R.id.nameField2);

        ps1 = (Spinner) findViewById(R.id.posSpinner1);
        ps2 = (Spinner) findViewById(R.id.posSpinner2);
        ps3 = (Spinner) findViewById(R.id.posSpinner3);
        ps4 = (Spinner) findViewById(R.id.posSpinner4);
        ps5 = (Spinner) findViewById(R.id.posSpinner5);
        ps6 = (Spinner) findViewById(R.id.posSpinner6);
        ps7 = (Spinner) findViewById(R.id.posSpinner7);
        ps8 = (Spinner) findViewById(R.id.posSpinner8);
        ps9 = (Spinner) findViewById(R.id.posSpinner9);
        ps10 = (Spinner) findViewById(R.id.posSpinner10);
        ps11 = (Spinner) findViewById(R.id.posSpinner11);
        ps12 = (Spinner) findViewById(R.id.posSpinner12);
        ps13 = (Spinner) findViewById(R.id.posSpinner13);
        ps14 = (Spinner) findViewById(R.id.posSpinner14);
        ps15 = (Spinner) findViewById(R.id.posSpinner15);
        ps16 = (Spinner) findViewById(R.id.posSpinner16);
        ps17 = (Spinner) findViewById(R.id.posSpinner17);
        ps18 = (Spinner) findViewById(R.id.posSpinner18);
        ps19 = (Spinner) findViewById(R.id.posSpinner19);
        ps20 = (Spinner) findViewById(R.id.posSpinner20);
        ps21 = (Spinner) findViewById(R.id.posSpinner21);
        ps22 = (Spinner) findViewById(R.id.posSpinner22);
        ps23 = (Spinner) findViewById(R.id.posSpinner23);
        ps24 = (Spinner) findViewById(R.id.posSpinner24);
        ps25 = (Spinner) findViewById(R.id.posSpinner25);
        ps26 = (Spinner) findViewById(R.id.posSpinner26);
        ps27 = (Spinner) findViewById(R.id.posSpinner27);
        ps28 = (Spinner) findViewById(R.id.posSpinner28);
        ps29 = (Spinner) findViewById(R.id.posSpinner29);
        ps30 = (Spinner) findViewById(R.id.posSpinner30);
        ps31 = (Spinner) findViewById(R.id.posSpinner31);
        ps32 = (Spinner) findViewById(R.id.posSpinner32);
        ps33 = (Spinner) findViewById(R.id.posSpinner33);
        ps34 = (Spinner) findViewById(R.id.posSpinner34);
        ps35 = (Spinner) findViewById(R.id.posSpinner35);
        ps36 = (Spinner) findViewById(R.id.posSpinner36);
        ps37 = (Spinner) findViewById(R.id.posSpinner37);
        ps38 = (Spinner) findViewById(R.id.posSpinner38);
        ps39 = (Spinner) findViewById(R.id.posSpinner39);
        ps40 = (Spinner) findViewById(R.id.posSpinner40);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.soccer_positions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nf2.setText(FileHelper.ReadFile(RosterPageActivity.this));
            }
        });

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (FileHelper.saveToFile( nf1.getText().toString())){
                    Toast.makeText(RosterPageActivity.this,"Saved to file",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(RosterPageActivity.this,"Error save file!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        hb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RosterPageActivity.this, DirectoryActivity.class));
            }
        });

        ps1.setAdapter(adapter);
        ps2.setAdapter(adapter);
        ps3.setAdapter(adapter);
        ps4.setAdapter(adapter);
        ps5.setAdapter(adapter);
        ps6.setAdapter(adapter);
        ps7.setAdapter(adapter);
        ps8.setAdapter(adapter);
        ps9.setAdapter(adapter);
        ps10.setAdapter(adapter);
        ps11.setAdapter(adapter);
        ps12.setAdapter(adapter);
        ps13.setAdapter(adapter);
        ps14.setAdapter(adapter);
        ps15.setAdapter(adapter);
        ps16.setAdapter(adapter);
        ps17.setAdapter(adapter);
        ps18.setAdapter(adapter);
        ps19.setAdapter(adapter);
        ps20.setAdapter(adapter);
        ps21.setAdapter(adapter);
        ps22.setAdapter(adapter);
        ps23.setAdapter(adapter);
        ps24.setAdapter(adapter);
        ps25.setAdapter(adapter);
        ps26.setAdapter(adapter);
        ps27.setAdapter(adapter);
        ps28.setAdapter(adapter);
        ps29.setAdapter(adapter);
        ps30.setAdapter(adapter);
        ps31.setAdapter(adapter);
        ps32.setAdapter(adapter);
        ps33.setAdapter(adapter);
        ps34.setAdapter(adapter);
        ps35.setAdapter(adapter);
        ps36.setAdapter(adapter);
        ps37.setAdapter(adapter);
        ps38.setAdapter(adapter);
        ps39.setAdapter(adapter);
        ps40.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.homeButton:
                break;

            case R.id.updateButton:

                break;
        }
    }

    private String readFromFile(Context context) {

        String ret = "";

        try {
            InputStream inputStream = context.openFileInput("address.txt");

            if (inputStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ((receiveString = bufferedReader.readLine()) != null) {
                    stringBuilder.append(receiveString);
                }
                inputStream.close();
                ret = stringBuilder.toString();
            }
        } catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }

        return ret;
    }
}