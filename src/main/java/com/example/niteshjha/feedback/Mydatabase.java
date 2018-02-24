package com.example.niteshjha.feedback;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;


public class Mydatabase extends SQLiteOpenHelper {

    Context context;

    public Mydatabase(Context context) {
        super(context, "UserRating", null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String qry = "create table userRatingTable(float rating)";
        sqLiteDatabase.execSQL(qry);

        Toast.makeText(context, "Database  and table has created", Toast.LENGTH_LONG).show();

    }

    public void insertData(ArrayList<String> list, SQLiteDatabase sqLiteDatabase) {
        String qry = "insert into Table_Name(cafe Name,values(" + list.get(0) + "," + list.get(1) + "," + list.get(2) + " )";
        sqLiteDatabase.execSQL(qry);

    }

    public ArrayList<String> getData(SQLiteDatabase db) {
        String qry = "select *from Table_Name";
        Cursor cursor = db.rawQuery(qry, null);
        ArrayList<String> list = new ArrayList<String>();
        if (cursor.moveToFirst()) {
            list.add(cursor.getString(0));
            list.add(cursor.getString(1));
            list.add(cursor.getString(2));

        }return list;

    }


        @Override
        public void onUpgrade (SQLiteDatabase sqLiteDatabase,int i, int i1){

        }
    }

