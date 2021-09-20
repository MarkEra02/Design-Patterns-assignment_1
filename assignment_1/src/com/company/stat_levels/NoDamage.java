package com.company.stat_levels;

import com.company.interfaces.DamageLevel;

public class NoDamage implements DamageLevel {

    @Override
    public void damage(){
        System.out.println("I can't even hurt you");
    }
}
