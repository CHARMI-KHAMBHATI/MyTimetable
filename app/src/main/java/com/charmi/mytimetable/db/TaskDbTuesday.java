package com.charmi.mytimetable.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDbTuesday extends SQLiteOpenHelper{

    public TaskDbTuesday(Context context) {
        super(context, TaskContractTuesday.DB_NAME, null, TaskContractTuesday.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TaskContractTuesday.TaskEntry.TABLE + " ( " +
                TaskContractTuesday.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskContractTuesday.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContractTuesday.TaskEntry.TABLE);
        onCreate(db);
    }
}
