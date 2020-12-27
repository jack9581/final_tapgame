package com.example.manualSliding;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {
    private static final String name = "myDB.db";
    private static final int version = 1;

    MyDBHelper(Context context){
        super(context,name,null,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String table = "CREATE TABLE myTable "+ "("+
                "ID INTEGER PRIMARY KEY," +
                "Name TEXT NOT NULL," +
                "Account TEXT NOT NULL," +
                "Password TEXT NOT NULL," +
                "Attack REAL NOT NULL," +
                "Coin REAL NOT NULL" +
                ");";
        db.execSQL(table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS myTable");
        onCreate(db);
    }
}