package game.can.be.fun.StrategySortPattern;

import behaviors.KnifeBehavior;
import behaviors.SwordBehavior;

public class AppRun {

	public static void main(String[] args) {

		Character ch = new King();

		ch.setWeapons(new SwordBehavior());

		ch.fight();

		Character knight = new Knight();

		knight.setWeapons(new KnifeBehavior());

		knight.fight();

	}
}
