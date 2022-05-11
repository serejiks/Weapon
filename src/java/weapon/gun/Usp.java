package java.weapon.gun;

import java.damageType.DamageType;
import java.util.ArrayList;

public class Usp<T extends DamageType> extends Gun<T>{


    @Override
    public void soundShoot() {
        //Звук выстрела
    }

    @Override
    public void soundRecharge() {
        //Звук перезарядки
    }


}
