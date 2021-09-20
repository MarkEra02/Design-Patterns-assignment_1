package com.company;

import com.company.stat_levels.BigDamage;

public class Main {

    public static void main(String[] args) {
        Warrior peasant = new Peasant();

        peasant.live();
        peasant.performRun();
        peasant.performFight();
        peasant.performHit();

        peasant.setDamageLevel(new BigDamage());

        peasant.performHit();
    }
}
