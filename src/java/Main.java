package java;

import java.damageType.ElectricDamageType;
import java.weapon.Weapon;
import java.weapon.gun.Gun;
import java.weapon.gun.Usp;

public class Main {
    public static void main(String[] args) {
        Gun usp = new Usp();
        usp.shoot();

        Usp<ElectricDamageType> usp1 = new Usp<ElectricDamageType>();
        ElectricDamageType type = usp1.damageType;
    }
}
