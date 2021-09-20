package com.company;

import com.company.stat_levels.BigDamage;
import com.company.stat_levels.CuttingCombatStyle;
import com.company.stat_levels.MediumSpeed;

public class Swordsman extends Warrior{

    public Swordsman() {
        super(new MediumSpeed(), new CuttingCombatStyle(), new BigDamage());
    }

    @Override
    public void live(){
        System.out.println("I am Swordsman");
    }
}
