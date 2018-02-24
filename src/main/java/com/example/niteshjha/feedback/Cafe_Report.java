package com.example.niteshjha.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cafe_Report extends AppCompatActivity {


    Spinner SpinnerBuildingName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe__report);


        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String currentDate = sdf.format(new Date());

        TextView tv = (TextView) findViewById(R.id.tv1);
        tv.setText(currentDate);


        SpinnerBuildingName = (Spinner)findViewById(R.id.spin1);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(Cafe_Report.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.NAMES));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerBuildingName.setAdapter(myadapter);


    }
    public  static void selectSpinnerItemByValue(Spinner spr, long value){
        SimpleCursorAdapter adapter =(SimpleCursorAdapter) spr.getAdapter();
        for(int position=0;position < adapter.getCount();position++){
            if(adapter.getItemId(position)==value){
                spr.setSelection(position);
                return ;

            }
        }
    }


    public void CafeReport(View v)
    {

        Intent i4 = new Intent(this,Feedback_Activity.class);
        startActivity(i4);
    }


}
