package com.hpu.sportsmeet;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "SignIn")
public class SignInTable implements Serializable {
    @PrimaryKey
    @ColumnInfo(name = "Id")
    private int id;


    @ColumnInfo(name = "username")
    private String username;

    @ColumnInfo(name="password")
    private String password;

    public int getId()
    {
        return id;
    }

    public void setId(int Serial)
    {
        this.id=Serial;
    }

    public void setUsername(String username)
    {
        this.username=username;
    }
    public String getUsername()
    {
        return username;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return password;
    }
}
