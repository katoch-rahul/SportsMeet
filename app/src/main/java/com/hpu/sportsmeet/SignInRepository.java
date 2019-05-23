package com.hpu.sportsmeet;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.os.AsyncTask;

import java.util.List;

public class SignInRepository {



    private SignInDOA signinDoa;
    private LiveData<List<SignInTable>> allData;



    public SignInRepository(Application application)
    {
       SignInDB db= SignInDB.getDatabase(application);
       signinDoa = db.signindoa();
       allData = signinDoa.getDetails();
    }
    public LiveData<List<SignInTable>> getAllData()
    {
        return allData;
    }

    public void insertData(SignInTable data)
    {
       new SigninInsertion(signinDoa).execute(data);
    }
    private static class SigninInsertion extends AsyncTask<SignInTable, Void, Void>
    {
        private SignInDOA signinDoa;

        private SigninInsertion(SignInDOA signinDoa)
        {
            this.signinDoa=signinDoa;
        }

        @Override
        protected Void doInBackground(SignInTable... data)
        {
            signinDoa.deleteAllData();

            signinDoa.insertDetails(data[0]);
            return null;
        }
    }

    }


