package com.hpu.sportsmeet;

public class Team {
    public String captain;
    public String year;
    public String roll;
    public String phone;
    public String mate1;
    public String roll1;
    public  String mate2;
    public String roll2;
    public String mate3;
    public  String roll3;
    public  String mate4;
    public  String roll4;
    public  String mate5;
    public  String roll5;
    
    public Team()
    {}
    
    
    public Team(String captain,String roll,String phone,String mate1,String roll1,String mate2,String roll2
                    ,String mate3,String roll3,String mate4,String roll4,String mate5,String roll5,String year)
    {
        this.year=year;
        this.captain=captain;
        this.roll=roll;
        this.phone=phone;
        this.mate1=mate1;
        this.roll1=roll1;
        this.mate2=mate2;
        this.roll2=roll2;
        this.mate3=mate3;
        this.roll3=roll3;
        this.mate4=mate4;
        this.roll4=roll4;
        this.mate5=mate5;
        this.roll5=roll5;

    }
}
