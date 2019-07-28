package com.hpu.sportsmeet;

public class Team {
    public String captain;
    public String igl;
    public String year;
    public String clan; //for cs
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
    public  String mate6;
    public  String roll6;
    public  String mate7;
    public  String roll7;
    public  String mate8;
    public  String roll8;
    public  String mate9;
    public  String roll9;
    public  String mate10;
    public  String roll10;
    public Team()
    {}
    public Team(String igl,String roll,String phone,String mate1,String roll1,String mate2,String roll2
            ,String mate3,String roll3,String mate4,String roll4,String year,String clan)
    { //constructor for cs,go
        this.year=year;
        this.clan=clan;
        this.igl=igl;
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


    }
    public Team(String captain,String roll,String phone,String mate1,String roll1,String mate2,String roll2
            ,String mate3,String roll3,String mate4,String roll4,String year)
    { //constructor for basketball
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


    }
    public Team(String captain,String roll,String phone,String mate1,String roll1,String mate2,String roll2
                    ,String mate3,String roll3,String mate4,String roll4,String mate5,String roll5,String year)
    { //constructor for volleyball
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
    public Team(String captain,String roll,String phone,String mate1,String roll1,String mate2,String roll2
            ,String mate3,String roll3,String mate4,String roll4,String mate5,String roll5,
                String mate6,String roll6,String mate7,String roll7,String mate8,String roll8,
                String mate9,String roll9,String mate10,String roll10,String year)
    {  //constructor for cricket and football
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
        this.mate6=mate6;
        this.roll6=roll6;
        this.mate7=mate7;
        this.roll7=roll7;
        this.mate8=mate8;
        this.roll8=roll8;
        this.mate9=mate9;
        this.roll9=roll9;
        this.mate10=mate10;
        this.roll10=roll10;

    }
}
