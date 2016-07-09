package com.charmi.mytimetable.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDbfri  extends SQLiteOpenHelper {


    public TaskDbfri(Context context) {
        super(context, TaskContractFri.DB_NAME, null, TaskContractFri.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TaskContractFri.TaskEntry.TABLE + " ( " +
                TaskContractFri.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskContractFri.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContractFri.TaskEntry.TABLE);
        onCreate(db);
    }
}
