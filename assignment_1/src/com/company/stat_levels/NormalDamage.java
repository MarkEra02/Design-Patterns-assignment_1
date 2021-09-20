package com.company.stat_levels;

import com.company.interfaces.DamageLevel;

public class NormalDamage implements DamageLevel {

    @Override
    public void damage(){
        System.out.println("I will need more time to kill you");
    }
}
