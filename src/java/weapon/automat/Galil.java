package java.weapon.automat;

import java.damageType.DamageType;

public class Galil<T extends DamageType> extends Automat<T>{

    @Override
    public void soundShoot() {
        //Звук выстрела
    }

    @Override
    public void soundRecharge() {
        //Звук перезарядки
    }

    @Override
    public void shoot() {

    }
}
