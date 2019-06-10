package com.hpu.sportsmeet;

public class Player {
    String name;
    String partner;
    String sem;
    String roll;

   String phone;


    public Player()
    {

    }
    public Player(String name,String sem,String roll,String phone)
    {
        this.name=name;

        this.sem=sem;
        this.roll=roll;
        this.phone=phone;

    }
    public Player(String name,String partner, String sem,String roll,String phone)
    {
        this.name=name;
        this.partner=partner;
        this.sem=sem;
        this.roll=roll;
        this.phone=phone;

    }
}
