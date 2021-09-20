package com.company.stat_levels;

import com.company.interfaces.CombatStyle;

public class NoCombatStyle implements CombatStyle {
    @Override
    public void combat(){
        System.out.println("I can't fight");
    }
}
