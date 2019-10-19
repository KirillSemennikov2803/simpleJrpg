package com.company.mobs;

import com.company.attack.Attack;

public interface Mob {
    Attack attack(); //возврашает аттаку моба
    boolean  takingDamage(Attack attack);//возврашает истину если моб умирает
    int[] endBattle();//возврашает количество опыта и золота за бой
}
