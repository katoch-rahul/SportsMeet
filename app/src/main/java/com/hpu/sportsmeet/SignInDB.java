package com.hpu.sportsmeet;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {SignInTable.class}, version=1, exportSchema = false)
public abstract class SignInDB extends RoomDatabase {

    public abstract SignInDOA signindoa();

    private static SignInDB INSTANCE;

    public static SignInDB getDatabase(final Context context)
    {
        if(INSTANCE == null)
        {  synchronized (SignInDB.class)
            {
                if(INSTANCE == null)
                {
                    INSTANCE = Room.databaseBuilder(context, SignInDB.class, "SignInDatabase")
                            .fallbackToDestructiveMigration().build();
                }
            }

        }
        return INSTANCE;
    }

}


