package com.company;

import com.company.stat_levels.FastSpeed;
import com.company.stat_levels.NormalDamage;
import com.company.stat_levels.ShootingCombatStyle;

public class Archer extends Warrior{

    public Archer() {
        super(new FastSpeed(), new ShootingCombatStyle(), new NormalDamage());
    }

    @Override
    public void live(){
        System.out.println("I am Archer");
    }
}
