package com.hpu.sportsmeet;

public class Player {
   public  String name;
    public  String partner;
    public String sem;
    public String roll;

    public  String phone;


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
