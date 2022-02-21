package test.java;

import main.java.Ant;
import main.java.Bat;
import main.java.Fly;
import main.java.Thing;
import main.java.Tiger;

public class BatTest {
	// String fixtures
		private final static String a_name;
		private final static String ant_eat;
		private final static String ant_hasEaten;

		private final static String b_name;
		private final static String bat_eat;
		private final static String bat_hasEaten;
		
		private final static String f_name;	
		private final static String fly_eat;
		private final static String fly_hasEaten;
				
		private final static String tiger_name;
		private final static String tiger_eat;
		private final static String tiger_hasEaten;
		
		private final static String move_out;
		private final static String hasNotEaten;
			
		static {
			b_name = "The Batman";
			bat_eat = b_name + " Bat has just eaten a Bat" ;
			bat_hasEaten = b_name + " Bat has eaten a Bat";
			
			a_name = "Anty";
			ant_eat = b_name + " Bat has just eaten a Ant" ;
			ant_hasEaten = b_name + " Bat has eaten a Ant";
			
			f_name = "Flyski";
			fly_eat = b_name + " Bat has just eaten a Fly" ;
			fly_hasEaten = b_name + " Bat has eaten a Fly";
			
			
			tiger_name = "Eye of The Tiger";
			tiger_eat = b_name + " Bat has just eaten a Tiger" ;
			tiger_hasEaten = b_name + " Bat has eaten a Tiger";
			
			move_out = b_name + " Bat is swooping through the dark.";
			hasNotEaten = b_name + " Bat has had nothing to eat!";
		}
			
		public static void AntEatingOut() {
			Bat bat = new Bat(b_name);
			Ant theAnt = new Ant(a_name);
			bat.eat(theAnt);
			if (bat.getCurrentMealLog().equals(ant_eat)) {
				System.out.println("ant_eat PASSED TESTING");
			}else {
				System.out.println("ant_eat FAILED TESTING");
			}
		}
		
		public static void AntHasEatenOut() {
			Bat Bat = new Bat(b_name);
			Ant theAnt = new Ant(a_name);
			Bat.eat(theAnt);
			Bat.whatDidYouEat();
			if (Bat.getCurrentMealLog().equals(ant_hasEaten)) {
				System.out.println("ant_hasEaten PASSED TESTING");
			}else {
				System.out.println("ant_hasEaten FAILED TESTING");
			}
		}
		
		public static void BatEatingOut() {
			Bat Bat = new Bat(b_name);
			Bat theBat = new Bat(b_name);
			Bat.eat(theBat);
			if(Bat.getCurrentMealLog().equals(bat_eat)) {
				System.out.println("bat_eat PASSED TESTING");
			}else {
				System.out.println("bat_eat FAILED TESTING");
			}
		}
		
		public static void BatHasEatenOut() {
			Bat Bat = new Bat(b_name);
			Bat theBat = new Bat(b_name);
			Bat.eat(theBat);
			Bat.whatDidYouEat();
			if (Bat.getCurrentMealLog().equals(bat_hasEaten)) {
				System.out.println("bat_hasEaten PASSED TESTING");
			}else {
				System.out.println("bat_hasEaten FAILED TESTING");
			}

		}
		
		public static void FlyEatingOut() {
			Bat Bat = new Bat(b_name);
			Fly theFly = new Fly(f_name);
			Bat.eat(theFly);
			if (Bat.getCurrentMealLog().equals(fly_eat)) {
				System.out.println("fly_eat PASSED TESTING");
			}else {
				System.out.println("fly_eat FAILED TESTING");
			}
		}
		
		public static void FlyHasEatenOut() {
			Bat Bat = new Bat(b_name);
			Fly theFly = new Fly(f_name);
			Bat.eat(theFly);
			Bat.whatDidYouEat();
			if (Bat.getCurrentMealLog().equals(fly_hasEaten)) {
				System.out.println("fly_hasEaten PASSED TESTING");
			}else {
				System.out.println("fly_hasEaten FAILED TESTING");
			}

		}
		
		public static void TigerEatingOut() {
			Bat Bat = new Bat(b_name);
			Tiger theTiger = new Tiger(tiger_name);
			Bat.eat(theTiger);
			if (Bat.getCurrentMealLog().equals(tiger_eat)) {
				System.out.println("tiger_eat PASSED TESTING");
			}else {
				System.out.println("tiger_eat FAILED TESTING");
			}
		}
		
		public static void TigerHasEatenOut() {
			Bat Bat = new Bat(b_name);
			Tiger theTiger = new Tiger(tiger_name);
			Bat.eat(theTiger);
			Bat.whatDidYouEat();
			if (Bat.getCurrentMealLog().equals(tiger_hasEaten)) {
				System.out.println("tiger_hasEaten PASSED TESTING");
			}else {
				System.out.println("tiger_hasEaten FAILED TESTING");
			}

		}
				
		public static void MovingOut() {
			Bat Bat = new Bat(b_name);
			Bat.move();
			if(Bat.getMoveString().equals(move_out)) {
				System.out.println("move_out PASSED TESTING");
			}else {
				System.out.println("move_out FAILED TESTING");
			}
		}
		
		public static void testFlyingExpectedOutput() {
			Bat bat = new Bat(b_name);
			bat.fly();
			if(bat.getMoveString().equals(move_out)){
				System.out.println("move_out PASSED TESTING");
			}else{
				System.out.println("move_out FAILED TESTING");
			}
		}

		public static void HasNotEatenOut() {
			Bat Bat = new Bat(b_name);
			if(Bat.getCurrentMealLog().equals(hasNotEaten)) {
				System.out.println("hasNotEaten PASSED TESTING");
			}else {
				System.out.println("hasNotEaten FAILED TESTING");
			}
		}
}
