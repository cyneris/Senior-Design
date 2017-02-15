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
    public Button hb, ub, cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13, cb14, cb15, cb16, cb17, cb18, cb19, cb20, cb21, cb22, cb23, cb24, cb25, cb26, cb27, cb28, cb29, cb30, cb31, cb32, cb33, cb34, cb35, cb36, cb37, cb38, cb39, cb40;
    public EditText nf1, nf2, nf3, nf4, nf5, nf6, nf7, nf8, nf9, nf10, nf11, nf12, nf13, nf14, nf15, nf16, nf17, nf18, nf19, nf20, nf21, nf22, nf23, nf24, nf25, nf26, nf27, nf28, nf29, nf30, nf31, nf32, nf33, nf34, nf35, nf36, nf37, nf38, nf39, nf40;
    public EditText af1, af2, af3, af4, af5, af6, af7, af8, af9, af10, af11, af12, af13, af14, af15, af16, af17, af18, af19, af20, af21, af22, af23, af24, af25, af26, af27, af28, af29, af30, af31, af32, af33, af34, af35, af36, af37, af38, af39, af40;
    public EditText nuf1, nuf2, nuf3, nuf4, nuf5, nuf6, nuf7, nuf8, nuf9, nuf10, nuf11, nuf12, nuf13, nuf14, nuf15, nuf16, nuf17, nuf18, nuf19, nuf20, nuf21, nuf22, nuf23, nuf24, nuf25, nuf26, nuf27, nuf28, nuf29, nuf30, nuf31, nuf32, nuf33, nuf34, nuf35, nuf36, nuf37, nuf38, nuf39, nuf40;
    public EditText gf1, gf2, gf3, gf4, gf5, gf6, gf7, gf8, gf9, gf10, gf11, gf12, gf13, gf14, gf15, gf16, gf17, gf18, gf19, gf20, gf21, gf22, gf23, gf24, gf25, gf26, gf27, gf28, gf29, gf30, gf31, gf32, gf33, gf34, gf35, gf36, gf37, gf38, gf39, gf40;
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
        cb2 = (Button) findViewById(R.id.clearButton2);
        cb3 = (Button) findViewById(R.id.clearButton3);
        cb4 = (Button) findViewById(R.id.clearButton4);
        cb5 = (Button) findViewById(R.id.clearButton5);
        cb6 = (Button) findViewById(R.id.clearButton6);
        cb7 = (Button) findViewById(R.id.clearButton7);
        cb8 = (Button) findViewById(R.id.clearButton8);
        cb9 = (Button) findViewById(R.id.clearButton9);
        cb10 = (Button) findViewById(R.id.clearButton10);
        cb11 = (Button) findViewById(R.id.clearButton11);
        cb12 = (Button) findViewById(R.id.clearButton12);
        cb13 = (Button) findViewById(R.id.clearButton13);
        cb14 = (Button) findViewById(R.id.clearButton14);
        cb15 = (Button) findViewById(R.id.clearButton15);
        cb16 = (Button) findViewById(R.id.clearButton16);
        cb17 = (Button) findViewById(R.id.clearButton17);
        cb18 = (Button) findViewById(R.id.clearButton18);
        cb19 = (Button) findViewById(R.id.clearButton19);
        cb20 = (Button) findViewById(R.id.clearButton20);
        cb21 = (Button) findViewById(R.id.clearButton21);
        cb22 = (Button) findViewById(R.id.clearButton22);
        cb23 = (Button) findViewById(R.id.clearButton23);
        cb24 = (Button) findViewById(R.id.clearButton24);
        cb25 = (Button) findViewById(R.id.clearButton25);
        cb26 = (Button) findViewById(R.id.clearButton26);
        cb27 = (Button) findViewById(R.id.clearButton27);
        cb28 = (Button) findViewById(R.id.clearButton28);
        cb29 = (Button) findViewById(R.id.clearButton29);
        cb30 = (Button) findViewById(R.id.clearButton30);
        cb31 = (Button) findViewById(R.id.clearButton31);
        cb32 = (Button) findViewById(R.id.clearButton32);
        cb33 = (Button) findViewById(R.id.clearButton33);
        cb34 = (Button) findViewById(R.id.clearButton34);
        cb35 = (Button) findViewById(R.id.clearButton35);
        cb36 = (Button) findViewById(R.id.clearButton36);
        cb37 = (Button) findViewById(R.id.clearButton37);
        cb38 = (Button) findViewById(R.id.clearButton38);
        cb39 = (Button) findViewById(R.id.clearButton39);
        cb40 = (Button) findViewById(R.id.clearButton40);

        nf1 = (EditText) findViewById(R.id.nameField1);
        nf2 = (EditText) findViewById(R.id.nameField2);
        nf3 = (EditText) findViewById(R.id.nameField3);
        nf4 = (EditText) findViewById(R.id.nameField4);
        nf5 = (EditText) findViewById(R.id.nameField5);
        nf6 = (EditText) findViewById(R.id.nameField6);
        nf7 = (EditText) findViewById(R.id.nameField7);
        nf8 = (EditText) findViewById(R.id.nameField8);
        nf9 = (EditText) findViewById(R.id.nameField9);
        nf10 = (EditText) findViewById(R.id.nameField10);
        nf11 = (EditText) findViewById(R.id.nameField11);
        nf12 = (EditText) findViewById(R.id.nameField12);
        nf13 = (EditText) findViewById(R.id.nameField13);
        nf14 = (EditText) findViewById(R.id.nameField14);
        nf15 = (EditText) findViewById(R.id.nameField15);
        nf16 = (EditText) findViewById(R.id.nameField16);
        nf17 = (EditText) findViewById(R.id.nameField17);
        nf18 = (EditText) findViewById(R.id.nameField18);
        nf19 = (EditText) findViewById(R.id.nameField19);
        nf20 = (EditText) findViewById(R.id.nameField20);
        nf21 = (EditText) findViewById(R.id.nameField21);
        nf22 = (EditText) findViewById(R.id.nameField22);
        nf23 = (EditText) findViewById(R.id.nameField23);
        nf24 = (EditText) findViewById(R.id.nameField24);
        nf25 = (EditText) findViewById(R.id.nameField25);
        nf26 = (EditText) findViewById(R.id.nameField26);
        nf27 = (EditText) findViewById(R.id.nameField27);
        nf28 = (EditText) findViewById(R.id.nameField28);
        nf29 = (EditText) findViewById(R.id.nameField29);
        nf30 = (EditText) findViewById(R.id.nameField30);
        nf31 = (EditText) findViewById(R.id.nameField31);
        nf32 = (EditText) findViewById(R.id.nameField32);
        nf33 = (EditText) findViewById(R.id.nameField33);
        nf34 = (EditText) findViewById(R.id.nameField34);
        nf35 = (EditText) findViewById(R.id.nameField35);
        nf36 = (EditText) findViewById(R.id.nameField36);
        nf37 = (EditText) findViewById(R.id.nameField37);
        nf38 = (EditText) findViewById(R.id.nameField38);
        nf39 = (EditText) findViewById(R.id.nameField39);
        nf40 = (EditText) findViewById(R.id.nameField40);

        af1 = (EditText) findViewById(R.id.ageField1);
        af2 = (EditText) findViewById(R.id.ageField2);
        af3 = (EditText) findViewById(R.id.ageField3);
        af4 = (EditText) findViewById(R.id.ageField4);
        af5 = (EditText) findViewById(R.id.ageField5);
        af6 = (EditText) findViewById(R.id.ageField6);
        af7 = (EditText) findViewById(R.id.ageField7);
        af8 = (EditText) findViewById(R.id.ageField8);
        af9 = (EditText) findViewById(R.id.ageField9);
        af10 = (EditText) findViewById(R.id.ageField10);
        af11 = (EditText) findViewById(R.id.ageField11);
        af12 = (EditText) findViewById(R.id.ageField12);
        af13 = (EditText) findViewById(R.id.ageField13);
        af14 = (EditText) findViewById(R.id.ageField14);
        af15 = (EditText) findViewById(R.id.ageField15);
        af16 = (EditText) findViewById(R.id.ageField16);
        af17 = (EditText) findViewById(R.id.ageField17);
        af18 = (EditText) findViewById(R.id.ageField18);
        af19 = (EditText) findViewById(R.id.ageField19);
        af20 = (EditText) findViewById(R.id.ageField20);
        af21 = (EditText) findViewById(R.id.ageField21);
        af22 = (EditText) findViewById(R.id.ageField22);
        af23 = (EditText) findViewById(R.id.ageField23);
        af24 = (EditText) findViewById(R.id.ageField24);
        af25 = (EditText) findViewById(R.id.ageField25);
        af26 = (EditText) findViewById(R.id.ageField26);
        af27 = (EditText) findViewById(R.id.ageField27);
        af28 = (EditText) findViewById(R.id.ageField28);
        af29 = (EditText) findViewById(R.id.ageField29);
        af30 = (EditText) findViewById(R.id.ageField30);
        af31 = (EditText) findViewById(R.id.ageField31);
        af32 = (EditText) findViewById(R.id.ageField32);
        af33 = (EditText) findViewById(R.id.ageField33);
        af34 = (EditText) findViewById(R.id.ageField34);
        af35 = (EditText) findViewById(R.id.ageField35);
        af36 = (EditText) findViewById(R.id.ageField36);
        af37 = (EditText) findViewById(R.id.ageField37);
        af38 = (EditText) findViewById(R.id.ageField38);
        af39 = (EditText) findViewById(R.id.ageField39);
        af40 = (EditText) findViewById(R.id.ageField40);

        nuf1 = (EditText) findViewById(R.id.numField1);
        nuf2 = (EditText) findViewById(R.id.numField2);
        nuf3 = (EditText) findViewById(R.id.numField3);
        nuf4 = (EditText) findViewById(R.id.numField4);
        nuf5 = (EditText) findViewById(R.id.numField5);
        nuf6 = (EditText) findViewById(R.id.numField6);
        nuf7 = (EditText) findViewById(R.id.numField7);
        nuf8 = (EditText) findViewById(R.id.numField8);
        nuf9 = (EditText) findViewById(R.id.numField9);
        nuf10 = (EditText) findViewById(R.id.numField10);
        nuf11 = (EditText) findViewById(R.id.numField11);
        nuf12 = (EditText) findViewById(R.id.numField12);
        nuf13 = (EditText) findViewById(R.id.numField13);
        nuf14 = (EditText) findViewById(R.id.numField14);
        nuf15 = (EditText) findViewById(R.id.numField15);
        nuf16 = (EditText) findViewById(R.id.numField16);
        nuf17 = (EditText) findViewById(R.id.numField17);
        nuf18 = (EditText) findViewById(R.id.numField18);
        nuf19 = (EditText) findViewById(R.id.numField19);
        nuf20 = (EditText) findViewById(R.id.numField20);
        nuf21 = (EditText) findViewById(R.id.numField21);
        nuf22 = (EditText) findViewById(R.id.numField22);
        nuf23 = (EditText) findViewById(R.id.numField23);
        nuf24 = (EditText) findViewById(R.id.numField24);
        nuf25 = (EditText) findViewById(R.id.numField25);
        nuf26 = (EditText) findViewById(R.id.numField26);
        nuf27 = (EditText) findViewById(R.id.numField27);
        nuf28 = (EditText) findViewById(R.id.numField28);
        nuf29 = (EditText) findViewById(R.id.numField29);
        nuf30 = (EditText) findViewById(R.id.numField30);
        nuf31 = (EditText) findViewById(R.id.numField31);
        nuf32 = (EditText) findViewById(R.id.numField32);
        nuf33 = (EditText) findViewById(R.id.numField33);
        nuf34 = (EditText) findViewById(R.id.numField34);
        nuf35 = (EditText) findViewById(R.id.numField35);
        nuf36 = (EditText) findViewById(R.id.numField36);
        nuf27 = (EditText) findViewById(R.id.numField37);
        nuf38 = (EditText) findViewById(R.id.numField38);
        nuf39 = (EditText) findViewById(R.id.numField39);
        nuf40 = (EditText) findViewById(R.id.numField40);

        gf1 = (EditText) findViewById(R.id.gradeField1);
        gf2 = (EditText) findViewById(R.id.gradeField2);
        gf3 = (EditText) findViewById(R.id.gradeField3);
        gf4 = (EditText) findViewById(R.id.gradeField4);
        gf5 = (EditText) findViewById(R.id.gradeField5);
        gf6 = (EditText) findViewById(R.id.gradeField6);
        gf7 = (EditText) findViewById(R.id.gradeField7);
        gf8 = (EditText) findViewById(R.id.gradeField8);
        gf9 = (EditText) findViewById(R.id.gradeField9);
        gf10 = (EditText) findViewById(R.id.gradeField10);
        gf11 = (EditText) findViewById(R.id.gradeField11);
        gf12 = (EditText) findViewById(R.id.gradeField12);
        gf13 = (EditText) findViewById(R.id.gradeField13);
        gf14 = (EditText) findViewById(R.id.gradeField14);
        gf15 = (EditText) findViewById(R.id.gradeField15);
        gf16 = (EditText) findViewById(R.id.gradeField16);
        gf17 = (EditText) findViewById(R.id.gradeField17);
        gf18 = (EditText) findViewById(R.id.gradeField18);
        gf19 = (EditText) findViewById(R.id.gradeField19);
        gf20 = (EditText) findViewById(R.id.gradeField20);
        gf21 = (EditText) findViewById(R.id.gradeField21);
        gf22 = (EditText) findViewById(R.id.gradeField22);
        gf23 = (EditText) findViewById(R.id.gradeField23);
        gf24 = (EditText) findViewById(R.id.gradeField24);
        gf25 = (EditText) findViewById(R.id.gradeField25);
        gf26 = (EditText) findViewById(R.id.gradeField26);
        gf27 = (EditText) findViewById(R.id.gradeField27);
        gf28 = (EditText) findViewById(R.id.gradeField28);
        gf29 = (EditText) findViewById(R.id.gradeField29);
        gf30 = (EditText) findViewById(R.id.gradeField30);
        gf31 = (EditText) findViewById(R.id.gradeField31);
        gf32 = (EditText) findViewById(R.id.gradeField32);
        gf33 = (EditText) findViewById(R.id.gradeField33);
        gf34 = (EditText) findViewById(R.id.gradeField34);
        gf35 = (EditText) findViewById(R.id.gradeField35);
        gf36 = (EditText) findViewById(R.id.gradeField36);
        gf37 = (EditText) findViewById(R.id.gradeField37);
        gf38 = (EditText) findViewById(R.id.gradeField38);
        gf39 = (EditText) findViewById(R.id.gradeField39);
        gf40 = (EditText) findViewById(R.id.gradeField40);

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

        cb2.setOnClickListener(this);
        cb3.setOnClickListener(this);
        cb4.setOnClickListener(this);
        cb5.setOnClickListener(this);
        cb6.setOnClickListener(this);
        cb7.setOnClickListener(this);
        cb8.setOnClickListener(this);
        cb9.setOnClickListener(this);
        cb10.setOnClickListener(this);
        cb11.setOnClickListener(this);
        cb12.setOnClickListener(this);
        cb13.setOnClickListener(this);
        cb14.setOnClickListener(this);
        cb15.setOnClickListener(this);
        cb16.setOnClickListener(this);
        cb17.setOnClickListener(this);
        cb18.setOnClickListener(this);
        cb19.setOnClickListener(this);
        cb20.setOnClickListener(this);
        cb21.setOnClickListener(this);
        cb22.setOnClickListener(this);
        cb23.setOnClickListener(this);
        cb24.setOnClickListener(this);
        cb25.setOnClickListener(this);
        cb26.setOnClickListener(this);
        cb27.setOnClickListener(this);
        cb28.setOnClickListener(this);
        cb29.setOnClickListener(this);
        cb30.setOnClickListener(this);
        cb31.setOnClickListener(this);
        cb32.setOnClickListener(this);
        cb33.setOnClickListener(this);
        cb34.setOnClickListener(this);
        cb35.setOnClickListener(this);
        cb36.setOnClickListener(this);
        cb37.setOnClickListener(this);
        cb38.setOnClickListener(this);
        cb39.setOnClickListener(this);
        cb40.setOnClickListener(this);

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
