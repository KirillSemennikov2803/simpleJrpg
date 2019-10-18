package com.company;

public class Slime implements Mob {

    @Override
    public Attack attack() {
        return null;
    }

    @Override
    public boolean takingDamage(Attack Attack) {
        return false;
    }
}
