package game.can.be.fun.StrategySortPattern;

import behaviors.WeaponBehavior;

public abstract class Character {

	WeaponBehavior	weapons;

	void fight() {
		weapons.useWeapon();
	}

	public void setWeapons(WeaponBehavior weapons) {
		this.weapons = weapons;
	}

}
