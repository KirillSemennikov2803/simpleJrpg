package com.company.armor;

public class Armor implements ArmorType {
    public int hp;
    protected int damageAbsorption;
    protected int changeToDamage;
    public Armor(int hp,int damageAbsorption,int changeToDamage){
        this.hp = hp;
        this.damageAbsorption = damageAbsorption;
        this.changeToDamage = changeToDamage;
    }
    @Override
    public int getDamageAbsorption() {
        return damageAbsorption;
    }

    @Override
    public int getChangeToDamageAbsorption() {
        return changeToDamage;
    }
}
