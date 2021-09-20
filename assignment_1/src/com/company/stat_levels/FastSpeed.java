package com.company.stat_levels;

import com.company.interfaces.SpeedLevel;

public class FastSpeed implements SpeedLevel {

    @Override
    public void speed(){
        System.out.println("I'm very fast");
    }
}
