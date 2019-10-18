package com.company;

public interface Mob {
    Attack attack(); //возврашает аттаку моба
    boolean  takingDamage(Attack Attack);//возврашает истину если моб умирает
}
