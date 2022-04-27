package java.Firearms;

import java.Weapon;

public abstract class Firearms extends Weapon {
    private int countBulletsInMagazine;
    private int countBulletsNow;
    private int countBulletsInAmmunition;
    private double rechargeTime;


    public Firearms(int countBulletsInMagazine, int countBulletsNow, int countBulletsInAmmunition, double rechargeTime) {
        this.countBulletsInMagazine = countBulletsInMagazine;
        this.countBulletsNow = countBulletsNow;
        this.countBulletsInAmmunition = countBulletsInAmmunition;
        this.rechargeTime = rechargeTime;
    }

    public void recharge() {
        //Перезарядка. Ждем rechargeTime сек., пополняем countBulletsNow из countBulletsInAmmunition
        // до countBulletsInMagazine. Вызывается soundRecharge.
    }



    //Звук выстрела
    //abstract void soundShoot();

    //Звук перезарядки
   // abstract void soundRecharge();


}
