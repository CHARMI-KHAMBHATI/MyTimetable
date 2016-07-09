package com.charmi.mytimetable.db;

import android.provider.BaseColumns;

public class TaskContractWed {

    public static final String DB_NAME = "com.charmi.mytimetable.wednesday.db";
    public static final int DB_VERSION = 3;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
