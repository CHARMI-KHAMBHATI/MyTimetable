package com.charmi.mytimetable.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDbwed  extends SQLiteOpenHelper {


    public TaskDbwed(Context context) {
        super(context, TaskContractWed.DB_NAME, null, TaskContractWed.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TaskContractWed.TaskEntry.TABLE + " ( " +
                TaskContractWed.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskContractWed.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContractWed.TaskEntry.TABLE);
        onCreate(db);
    }
}
