package com.company.stat_levels;

import com.company.interfaces.DamageLevel;

public class BigDamage implements DamageLevel {

    @Override
    public void damage(){
        System.out.println("I can kill you by one hit");
    }
}
