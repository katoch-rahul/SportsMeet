package com.hpu.sportsmeet;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.provider.ContactsContract;

import java.util.List;

@Dao
public interface SignInDOA {

    @Insert
    void insertDetails(SignInTable data);

    @Query("select * from SignIn")
    LiveData<List<SignInTable>> getDetails();

    @Query("delete from SignIn")
    void deleteAllData();

}
