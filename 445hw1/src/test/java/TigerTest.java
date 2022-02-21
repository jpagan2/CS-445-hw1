package test.java;

import main.java.Ant;
import main.java.Bat;
import main.java.Fly;
import main.java.Thing;
import main.java.Tiger;

public class TigerTest {
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
		
		private final static String t_name;
		private final static String thing_eat;
		private final static String thing_hasEaten;
		
		private final static String tiger_name;
		private final static String tiger_eat;
		private final static String tiger_hasEaten;
		
		private final static String move_out;
		private final static String hasNotEaten;
			
		static {
			tiger_name = "Eye of The Tiger";
			tiger_eat = tiger_name + " Tiger has just eaten a Tiger" ;
			tiger_hasEaten = tiger_name + " Tiger has eaten a Tiger";

			a_name = "Anty";
			ant_eat = tiger_name + " Tiger has just eaten a Ant" ;
			ant_hasEaten = tiger_name + " Tiger has eaten a Ant";
			
			b_name = "The Batman";
			bat_eat = tiger_name + " Tiger has just eaten a Bat" ;
			bat_hasEaten = tiger_name + " Tiger has eaten a Bat";
			
			f_name = "Flyski";
			fly_eat = tiger_name + " Tiger has just eaten a Fly" ;
			fly_hasEaten = tiger_name + " Tiger has eaten a Fly";
			
			t_name = "Thing1";
			thing_eat = tiger_name + " Tiger has just eaten a Thing" ;
			thing_hasEaten = tiger_name + " Tiger has eaten a Thing";
						
			move_out = tiger_name + " Tiger has just pounced.";
			hasNotEaten = tiger_name + " Tiger has had nothing to eat!";
		}
			
		public static void AntEatingOut() {
			Tiger tiger = new Tiger(tiger_name);
			Ant theAnt = new Ant(a_name);
			tiger.eat(theAnt);
			if (tiger.getCurrentMealLog().equals(ant_eat)) {
				System.out.println("ant_eat PASSED TESTING");
			}else {
				System.out.println("ant_eat FAILED TESTING");
			}
		}
		
		public static void AntHasEatenOut() {
			Tiger tiger = new Tiger(tiger_name);
			Ant theAnt = new Ant(a_name);
			tiger.eat(theAnt);
			tiger.whatDidYouEat();
			if (tiger.getCurrentMealLog().equals(ant_hasEaten)) {
				System.out.println("ant_hasEaten PASSED TESTING");
			}else {
				System.out.println("ant_hasEaten FAILED TESTING");
			}
		}
		
		public static void BatEatingOut() {
			Tiger tiger = new Tiger(tiger_name);
			Bat theBat = new Bat(b_name);
			tiger.eat(theBat);
			if(tiger.getCurrentMealLog().equals(bat_eat)) {
				System.out.println("bat_eat PASSED TESTING");
			}else {
				System.out.println("bat_eat FAILED TESTING");
			}
		}
		
		public static void BatHasEatenOut() {
			Tiger tiger = new Tiger(tiger_name);
			Bat theBat = new Bat(b_name);
			tiger.eat(theBat);
			tiger.whatDidYouEat();
			if (tiger.getCurrentMealLog().equals(bat_hasEaten)) {
				System.out.println("bat_hasEaten PASSED TESTING");
			}else {
				System.out.println("bat_hasEaten FAILED TESTING");
			}

		}
		
		public static void FlyEatingOut() {
			Tiger tiger = new Tiger(tiger_name);
			Fly theFly = new Fly(f_name);
			tiger.eat(theFly);
			if (tiger.getCurrentMealLog().equals(fly_eat)) {
				System.out.println("fly_eat PASSED TESTING");
			}else {
				System.out.println("fly_eat FAILED TESTING");
			}
		}
		
		public static void FlyHasEatenOut() {
			Tiger tiger = new Tiger(tiger_name);
			Fly theFly = new Fly(f_name);
			tiger.eat(theFly);
			tiger.whatDidYouEat();
			if (tiger.getCurrentMealLog().equals(fly_hasEaten)) {
				System.out.println("fly_hasEaten PASSED TESTING");
			}else {
				System.out.println("fly_hasEaten FAILED TESTING");
			}

		}
		
		public static void ThingEatingOut() {
			Tiger tiger = new Tiger(tiger_name);
			Thing theThing = new Thing(t_name);
			tiger.eat(theThing);
			if (tiger.getCurrentMealLog().equals(thing_eat)) {
				System.out.println("thing_eat PASSED TESTING");
			}else {
				System.out.println("thing_eat FAILED TESTING");
			}

		}
		
		public static void ThingHasEatenOut() {
			Tiger tiger = new Tiger(tiger_name);
			Thing theThing = new Thing(t_name);
			tiger.eat(theThing);
			tiger.whatDidYouEat();
			if (tiger.getCurrentMealLog().equals(thing_hasEaten)) {
				System.out.println("thing_hasEaten PASSED TESTING");
			}else {
				System.out.println("thing_hasEaten FAILED TESTING");
			}

		}
		
		public static void TigerEatingOut() {
			Tiger tiger = new Tiger(tiger_name);
			Tiger theTiger = new Tiger(tiger_name);
			tiger.eat(theTiger);
			if (tiger.getCurrentMealLog().equals(tiger_eat)) {
				System.out.println("tiger_eat PASSED TESTING");
			}else {
				System.out.println("tiger_eat FAILED TESTING");
			}
		}
		
		public static void TigerHasEatenOut() {
			Tiger tiger = new Tiger(tiger_name);
			Tiger theTiger = new Tiger(tiger_name);
			tiger.eat(theTiger);
			tiger.whatDidYouEat();
			if (tiger.getCurrentMealLog().equals(tiger_hasEaten)) {
				System.out.println("tiger_hasEaten PASSED TESTING");
			}else {
				System.out.println("tiger_hasEaten FAILED TESTING");
			}

		}
				
		public static void MovingOut() {
			Tiger tiger = new Tiger(tiger_name);
			tiger.move();
			if(tiger.getMoveString().equals(move_out)) {
				System.out.println("move_out PASSED TESTING");
			}else {
				System.out.println("move_out FAILED TESTING");
			}
		}
		
		public static void HasNotEatenOut() {
			Tiger tiger = new Tiger(tiger_name);
			if(tiger.getCurrentMealLog().equals(hasNotEaten)) {
				System.out.println("hasNotEaten PASSED TESTING");
			}else {
				System.out.println("hasNotEaten FAILED TESTING");
			}
		}
}
