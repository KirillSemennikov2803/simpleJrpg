package com.company;

import java.util.Random;

import com.company.armor.Armor;
import com.company.armor.ArmorType;
import com.company.attack.Attack;
import com.company.attack.AttackType;
import com.company.mobs.Mob;

public class Hero {
    private int hp = 50;
    private int damage = 5;
    private int exp = 0;//ever 10 point level up
    private int level = 1;
    private int gold = 0;

    private ArmorType armor;
    private AttackType weapon;

    public Hero(){
        this.armor = new Armor(0,0,0);
        this.weapon = new Attack(10,10);
    }

    public int getHp(){
        return hp;
    }

    public void endBattle(Mob mob){
       int[] reward = mob.endBattle();
       this.exp  += reward[0];
       this.gold += reward[1];
       if (this.exp / 10 > 0) {
           this.level += this.exp / 10;
           this.exp  %= 10;
           levelUp(this.exp / 10);
       }
    }

    public void levelUp(int level){
        this.hp += level * 10;
        this.damage += level * 3;
    }

    public Attack getAttack(){
        Random random = new Random(hp);
        int ran =  random.nextInt(99);
        int ch =  weapon.getAdditionalDamage();
        if (ran < ch){
            return new Attack(damage+weapon.getAdditionalDamage(),100);
        }
        return new Attack(damage,100);
    }

    //возврашает истину если герой умер
    public boolean getDamage(Attack att){
        int damg = att.getAdditionalDamage();
        Random random = new Random();
        int ran =  random.nextInt(99);
        int ch = this.armor.getChangeToDamageAbsorption();
        if (ran < ch){
            damg -= this.armor.getDamageAbsorption();
        }
        if (hp - damg <=0){
            return true;
        }
        else {
            hp -= damg;
            return false;
        }
    }
 }
