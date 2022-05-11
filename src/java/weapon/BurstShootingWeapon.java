package java.weapon;

import java.BurstShooting;
import java.SingleShooting;
import java.damageType.DamageType;

public class BurstShootingWeapon<T extends DamageType> extends Weapon<T> implements BurstShooting {
    @Override
    public void soundShoot() {

    }

    @Override
    public void soundRecharge() {

    }

    @Override
    public void shoot() {

    }
}
