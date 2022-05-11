package java.grenades;

import java.weapon.Weapon;

public abstract class Grenades implements Throwing {

    @Override
    public void throwingGrenade() {
        // Бросок гранаты.
        // soundExplosion()
    }

    public abstract void soundExplosion();
}
