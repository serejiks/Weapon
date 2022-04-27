package java.firearms.gun;

import java.firearms.Firearms;
import java.firearms.SingleShooting;

public abstract class Gun extends Firearms implements SingleShooting {

    public Gun(int countBulletsInMagazine, int countBulletsNow, int countBulletsInAmmunition, double rechargeTime) {
        super(countBulletsInMagazine, countBulletsNow, countBulletsInAmmunition, rechargeTime);
    }

    public void attack(){
        //Реализация одичного выстрела
    }


}
