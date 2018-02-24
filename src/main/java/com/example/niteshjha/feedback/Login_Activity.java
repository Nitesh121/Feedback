package com.example.niteshjha.feedback;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import 	java.text.SimpleDateFormat;
import java.util.Date;


public class Login_Activity extends AppCompatActivity {

    Spinner SpinnerBuildingName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

       // Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String currentDate = sdf.format(new Date());

        TextView tv =(TextView)findViewById(R.id.et2);
        tv.setText(currentDate);


        SpinnerBuildingName = (Spinner)findViewById(R.id.spin);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(Login_Activity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.NAMES));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         SpinnerBuildingName.setAdapter(myadapter);


    }

        public  void Submit1( View v)
        {
            Intent i=  new Intent(this,Feedback_Activity.class);
            startActivity(i);

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



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login1, menu);
        return true;
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.memberLogin:
                Intent i = new Intent(this,Cafe_Report.class);
                this.startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




    }



