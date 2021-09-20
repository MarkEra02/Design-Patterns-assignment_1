package com.company;

import com.company.stat_levels.BigDamage;
import com.company.stat_levels.CuttingCombatStyle;
import com.company.stat_levels.FastSpeed;

public class Rider extends Warrior{
    public Rider() {
        super(new FastSpeed(), new CuttingCombatStyle(), new BigDamage());
    }

    @Override
    public void live(){
        System.out.println("I am Rider");
    }
}
