package com.company.stat_levels;

import com.company.interfaces.SpeedLevel;

public class MediumSpeed implements SpeedLevel {

    @Override
    public void speed() {
        System.out.println("I'm an ordinary runner");
    }
}
