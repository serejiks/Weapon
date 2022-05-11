package java.weapon;

import java.damageType.DamageType;

public abstract class Weapon<T extends DamageType> {
    private int countBulletsInMagazine;
    private int countBulletsNow;
    private int countBulletsInAmmunition;
    private double rechargeTime;
    private int damage;
    public T damageType;

    public Weapon() {

    }

    public Weapon(int countBulletsInMagazine, int countBulletsNow, int countBulletsInAmmunition, double rechargeTime) {
        this.countBulletsInMagazine = countBulletsInMagazine;
        this.countBulletsNow = countBulletsNow;
        this.countBulletsInAmmunition = countBulletsInAmmunition;
        this.rechargeTime = rechargeTime;
    }

    public Weapon(int countBulletsInMagazine, int countBulletsNow, int countBulletsInAmmunition, double rechargeTime, int damage) {
        this.countBulletsInMagazine = countBulletsInMagazine;
        this.countBulletsNow = countBulletsNow;
        this.countBulletsInAmmunition = countBulletsInAmmunition;
        this.rechargeTime = rechargeTime;
        this.damage = damage;
    }

    public void recharge() {
        //Перезарядка. Ждем rechargeTime сек., пополняем countBulletsNow из countBulletsInAmmunition до countBulletsInMagazine.
        // Вызывается soundRecharge.
    }



    //Звук выстрела
    public abstract void soundShoot();

    //Звук перезарядки
    public abstract void soundRecharge();


    public int getCountBulletsInMagazine() {
        return countBulletsInMagazine;
    }

    public void setCountBulletsInMagazine(int countBulletsInMagazine) {
        this.countBulletsInMagazine = countBulletsInMagazine;
    }

    public int getCountBulletsNow() {
        return countBulletsNow;
    }

    public void setCountBulletsNow(int countBulletsNow) {
        this.countBulletsNow = countBulletsNow;
    }

    public int getCountBulletsInAmmunition() {
        return countBulletsInAmmunition;
    }

    public void setCountBulletsInAmmunition(int countBulletsInAmmunition) {
        this.countBulletsInAmmunition = countBulletsInAmmunition;
    }

    public double getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(double rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public T getDamageType() {
        return damageType;
    }

    public void setDamageType(T damageType) {
        this.damageType = damageType;
    }
}
