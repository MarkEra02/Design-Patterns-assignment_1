package com.company;

import com.company.interfaces.CombatStyle;
import com.company.interfaces.DamageLevel;
import com.company.interfaces.SpeedLevel;

public abstract class Warrior {

    private CombatStyle combatStyle;
    private SpeedLevel speedLevel;
    private DamageLevel damageLevel;

    public Warrior(SpeedLevel speedLevel, CombatStyle combatStyle, DamageLevel damageLevel){
        this.combatStyle = combatStyle;
        this.speedLevel = speedLevel;
        this.damageLevel = damageLevel;
    }

    public void performFight(){
        this.combatStyle.combat();
    }

    public void performRun(){
        this.speedLevel.speed();
    }

    public void performHit(){
        this.damageLevel.damage();
    }

    public abstract void live();



    public CombatStyle getCombatStyle() {
        return combatStyle;
    }

    public void setCombatStyle(CombatStyle combatStyle) {
        this.combatStyle = combatStyle;
    }

    public SpeedLevel getSpeedLevel() {
        return speedLevel;
    }

    public void setSpeedLevel(SpeedLevel speedLevel) {
        this.speedLevel = speedLevel;
    }

    public DamageLevel getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(DamageLevel damageLevel) {
        this.damageLevel = damageLevel;
    }
}
