package com.charmi.mytimetable.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDbMonday extends SQLiteOpenHelper {


     public TaskDbMonday(Context context) {
        super(context, TaskContractMonday.DB_NAME, null, TaskContractMonday.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TaskContractMonday.TaskEntry.TABLE + " ( " +
                TaskContractMonday.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskContractMonday.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContractMonday.TaskEntry.TABLE);
        onCreate(db);
    }
}
