package com.charmi.mytimetable.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDbsat extends SQLiteOpenHelper {


    public TaskDbsat(Context context) {
        super(context, TaskContractSat.DB_NAME, null, TaskContractSat.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TaskContractSat.TaskEntry.TABLE + " ( " +
                TaskContractSat.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskContractSat.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContractSat.TaskEntry.TABLE);
        onCreate(db);
    }
}
