package edu.osu.cse.befit.befit.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by siddhi on 3/23/15.
 */
public class DBService {
    private SQLiteDatabase db;
    private DBHelper dbHelper;
    static final String TAG = "BeFitDBService";

    public DBService(Context context) {
        dbHelper = new DBHelper(context);

    }
    public void open() throws SQLException {
        Log.e(TAG, "+++ Opening DB +++");
        db = dbHelper.getWritableDatabase();
    }

    public void close() {
        Log.e(TAG, "+++ Closing DB +++");
        dbHelper.close();
    }
    /*---------methods deleting entries to DB--------------*/
    public void deleteAll() {
        Log.e(TAG, "+++ In Delete All +++");
        db = dbHelper.getWritableDatabase();
        int i = db.delete(DBHelper.activityTable, null, null);
        int j = db.delete(DBHelper.logTable, null, null);
        int k = db.delete(DBHelper.userTable, null, null);
        //int k = db.delete(DBHelper.medTable, null, null);
    }

	}
                }
