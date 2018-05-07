package com.example.asus.myapplication;

import java.io.Serializable;

/**
 * Created by asus on 2017-09-27.
 */

public class ItemInfo  implements Serializable{
    private String name;
    private  int acctack;
    private  int life;
    private  int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcctack() {
        return acctack;
    }

    public void setAcctack(int acctack) {
        this.acctack = acctack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ItemInfo(String name, int acctack, int life, int speed){
         this.name = name;
         this.acctack = acctack;
         this.life = life;
         this.speed = speed;
     }

}