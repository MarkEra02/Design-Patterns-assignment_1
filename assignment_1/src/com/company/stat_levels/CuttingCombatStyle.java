package com.company.stat_levels;

import com.company.interfaces.CombatStyle;

public class CuttingCombatStyle implements CombatStyle {

    @Override
    public void combat(){
        System.out.println("I can cut my enemies");
    }
}
