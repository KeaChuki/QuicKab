package com.example.zumo.qq;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by zumo on 3/31/2017.
 */

public class RiderDatabase extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="Rider.db";
    private static final String TABLE_NAME="Riders";
    private static final String COLUMN_ID="id";
    private static final String COLUMN_NAME="name";
    private static final String COLUMN_CID="cid";
    private static final String COLUMN_PHONE="phone";
    private static final String COLUMN_PASS="pass";
    SQLiteDatabase db;

    //Query
    private static final String TABLE_CREATE="Create table Riders(phone int primary key not null auto-increment,"+ "id int not null, name text not null,cid text not null,pass text not null);";

    //constructor
    public RiderDatabase(Context context)
    {
         super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(TABLE_CREATE);
        this.db=db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String query="DROP TABLE IF EXISTS"+ TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

   }
}
