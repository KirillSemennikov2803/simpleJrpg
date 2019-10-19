package com.company.attack;


import java.util.Vector;

public class Attack implements AttackType {

    protected int damage;
    protected int changeToDamage;
    public Attack(int damage,int changeToDamage){
        this.damage = damage;
        this.changeToDamage = changeToDamage;
    }
    @Override
    public int getAdditionalDamage() {
        return damage;
    }

    @Override
    public int getChangeToAdditionalDamage() {
        return changeToDamage;
    }
}
