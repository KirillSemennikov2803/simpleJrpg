package com.company.mobs;

import com.company.attack.Attack;

import java.util.Random;

public class Slime implements Mob {

    private int hp;
    private int evasion;
    private Attack attack;
    private int gold;
    private int exp;

    public Slime(int hp, int evasion, int gold, int exp){
        this.hp = hp;
        this.evasion = evasion;
        this.gold = gold;
        this.exp = exp;
        this.attack = new Attack(10,100);
    }
    public int getHp(){
        return this.hp;
    }
    @Override
    public Attack attack() {
        return attack;
    }

    @Override
    public boolean takingDamage(Attack att) {
        int damg = att.getAdditionalDamage();
        Random random = new Random();
        int ran =  random.nextInt(99);
        if (ran < evasion){
            damg = 0 ;
        }
        if (hp - damg <=0){
            return true;
        }
        else {
            hp -= damg;
            return false;
        }
    }

    @Override
    public int[] endBattle() {
        int[] reward = new int[2];
        reward[0] = this.exp;
        reward[1] = this.gold;
        return reward;
    }
}
