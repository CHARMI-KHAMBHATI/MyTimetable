package com.charmi.mytimetable.db;

import android.provider.BaseColumns;


public class TaskContractThurs {

    public static final String DB_NAME = "com.charmi.mytimetable.thursday.db";
    public static final int DB_VERSION = 4;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
