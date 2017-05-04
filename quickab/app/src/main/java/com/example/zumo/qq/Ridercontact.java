package com.example.zumo.qq;

/**
 * Created by zumo on 3/31/2017.
 */

public class Ridercontact {
    int id,phone,cid;
    String name,pass;

    //create method for Id
    public void  SetID(int id)
    {
        this.id=id;
    }
    public int getID()
    {
        return this.id;
    }
    //method for name
    public void  SetName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    //method for cid
    public void SetCID(int cid)
    {
        this.cid=cid;
    }
    public int getCID()
    {
        return this.cid;
    }
    //method for phone
    public void  SetPhone(int phone)
    {
        this.phone=phone;
    }
    public int getPhone()
    {
        return this.phone;
    }
    //method for pass
    public void  SetPass(String pass)
    {
        this.pass=pass;
    }
    public String getPass()
    {
        return this.pass;
    }
}
