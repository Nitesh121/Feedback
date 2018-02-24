package com.example.niteshjha.feedback;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;


public class Feedback_Activity extends AppCompatActivity {
    RatingBar ratingBar;
    private static Button Button_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_);
        ratingBar=(RatingBar)findViewById(R.id.r1);
        feed();


    }
    public void feed()
    {
       //Dialog Box

        Button_sub =(Button)findViewById(R.id.b3);
        Button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder a_builder = new AlertDialog.Builder(Feedback_Activity.this);
                a_builder.setMessage(" ** Thank you **").setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                                Intent i1= new Intent(Feedback_Activity.this,Login_Activity.class);
                                startActivity(i1);
                            }
                        });
                AlertDialog alert = a_builder.create();
                alert.setTitle("Feedbback ");
                alert.show();
            }

        });


    /* float rating = ratingBar.getRating();
        Mydatabase mydatabase = new Mydatabase(this);
        SQLiteDatabase sqLiteDatabase = mydatabase.getWritableDatabase();
        String qry = "Insert into userRatingTable values("+rating+")";
        sqLiteDatabase.execSQL(qry);
        Toast.makeText(this,"your rating submit",Toast.LENGTH_SHORT).show();
       // Intent i =new Intent(this,Login_Activity.class);
       // startActivity(i);*/

    }


}
