package java.weapon.automat;

import java.BurstShooting;
import java.damageType.DamageType;
import java.prepare.PrepareWeapon;
import java.weapon.BurstShootingWeapon;
import java.weapon.Weapon;

public abstract class Automat<T extends DamageType> extends BurstShootingWeapon<T> implements PrepareWeapon {


    @Override
    public void setWeapon() {

    }

    @Override
    public void takeWeapon() {

    }
}
