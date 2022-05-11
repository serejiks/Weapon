package java.weapon.gun;

import java.damageType.DamageType;

public class Glock<T extends DamageType> extends Gun<T>{

    @Override
    public void soundShoot() {
        //Звук выстрела
    }

    @Override
    public void soundRecharge() {
        //Звук перезарядки
    }
}
