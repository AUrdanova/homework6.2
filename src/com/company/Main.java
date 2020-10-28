package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon lightsaber = new Weapon("Vaapad", "Ligthsaber");
        Bosss angryBird = new Bosss();
        angryBird.setCommonHealth(700);
        angryBird.setCommonDamage(170);
        angryBird.setLightSaber(lightsaber);
        System.out.println("Boss damage: " + angryBird.getCommonDamage()
                + "Boss Health: "
                + angryBird.getCommonHealth()
                + "The weapon of Boss: " + angryBird.getLightSaber().getWeaponName() + "Type: "
                + angryBird.getLightSaber().getWeaponType());


    }
}
