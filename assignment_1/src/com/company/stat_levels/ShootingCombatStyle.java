package com.company.stat_levels;

import com.company.interfaces.CombatStyle;

public class ShootingCombatStyle implements CombatStyle {
    @Override
    public void combat(){
        System.out.println("I can shoot my enemy from afar");
    }
}
