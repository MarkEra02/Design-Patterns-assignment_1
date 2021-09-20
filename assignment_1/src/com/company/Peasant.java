package com.company;

import com.company.stat_levels.LowSpeed;
import com.company.stat_levels.NoCombatStyle;
import com.company.stat_levels.NoDamage;

public class Peasant extends Warrior{

    public Peasant() {
        super(new LowSpeed(), new NoCombatStyle(), new NoDamage());
    }

    @Override
    public void live(){
        System.out.println("I am Peasant");
    }
}