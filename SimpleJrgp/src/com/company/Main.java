package com.company;

import com.company.mobs.Slime;
import com.company.mobs.Mob;

public class Main {

    public static void main(String[] args) {
        Hero myHero = new Hero();
        Mob fristSlime = new Slime(20,10,20,30);
        for (int i = 0; i < 10; i++) {
            System.out.println(myHero.getHp());
            myHero.getDamage(fristSlime.attack());
            System.out.println(myHero.getHp());
            System.out.println("________________");
        }



    }
}
