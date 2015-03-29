package edu.osu.cse.befit.befit.db;

/**
 * Created by siddhi on 3/23/15.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {
    static final String TAG = "BeFit";
    //DB Schema
    public static final String dbName = "BeFitDB";
    public static final String logTable = "logTable";
    public static final String activityTable = "activityTable";
    public static final String trackerTable = "trackerTable";
    public static final String userTable = "userTable";



    public DBHelper(Context context) {
        super(context, dbName, null,6); //DBHelper version
    }
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                    int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }
    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion,
                          int newVersion) {
    }
}
