package java.weapon;

import java.SingleShooting;
import java.damageType.DamageType;

public abstract class SingleShootingWeapon<T extends DamageType> extends Weapon<T> implements SingleShooting {

    public SingleShootingWeapon() {

    }

    public SingleShootingWeapon(int countBulletsInMagazine, int countBulletsNow, int countBulletsInAmmunition, double rechargeTime, int damage) {
        super(countBulletsInMagazine, countBulletsNow, countBulletsInAmmunition, rechargeTime, damage);
    }

    @Override
    public void shoot() {

    }

    @Override
    public void soundShoot() {

    }

    @Override
    public void soundRecharge() {

    }
}
