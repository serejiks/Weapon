package java.firearms.automat;

import java.firearms.BurstShooting;
import java.firearms.Firearms;

public abstract class Automat extends Firearms implements BurstShooting {

    public Automat(int countBulletsInMagazine, int countBulletsNow, int countBulletsInAmmunition, double rechargeTime) {
        super(countBulletsInMagazine, countBulletsNow, countBulletsInAmmunition, rechargeTime);
    }

    public void attack(){
        //Реализация выстрелов очередью
    }
}
