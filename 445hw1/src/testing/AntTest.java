package testing;

import main.Ant;
import main.Bat;
import main.Creature;
import main.Fly;
import main.Flyer;
import main.Thing;
import main.Tiger;

public class AntTest {
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
			a_name = "Anty";
			ant_eat = a_name + " Ant has just eaten a Ant" ;
			ant_hasEaten = a_name + " Ant has eaten a Ant";
			
			b_name = "The Batman";
			bat_eat = a_name + " Ant has just eaten a Bat" ;
			bat_hasEaten = a_name + " Ant has eaten a Bat";
			
			f_name = "Flyski";
			fly_eat = a_name + " Ant has just eaten a Fly" ;
			fly_hasEaten = a_name + " Ant has eaten a Fly";
			
			t_name = "Thing1";
			thing_eat = a_name + " Ant has just eaten a Thing" ;
			thing_hasEaten = a_name + " Ant has eaten a Thing";
			
			tiger_name = "Eye of The Tiger";
			tiger_eat = a_name + " Ant has just eaten a Tiger" ;
			tiger_hasEaten = a_name + " Ant has eaten a Tiger";
			
			move_out = a_name + " Ant is crawling around.";
			hasNotEaten = a_name + " Ant has had nothing to eat!";
		}
			
		public static void AntEatingOut() {
			Ant ant = new Ant(a_name);
			Ant aAnt = new Ant(a_name);
			ant.eat(aAnt);
			if (ant.getCurrentMealLog().equals(ant_eat)) {
				System.out.println("ant_eat PASSED TESTING");
			}else {
				System.out.println("ant_eat FAILED TESTING");
			}
		}
		
		public static void AntHasEatenOut() {
			Ant ant = new Ant(a_name);
			Ant aAnt = new Ant(a_name);
			ant.eat(aAnt);
			ant.whatDidYouEat();
			if (ant.getCurrentMealLog().equals(ant_hasEaten)) {
				System.out.println("ant_hasEaten PASSED TESTING");
			}else {
				System.out.println("ant_hasEaten FAILED TESTING");
			}
		}
		
		public static void BatEatingOut() {
			Ant ant = new Ant(a_name);
			Bat aBat = new Bat(b_name);
			ant.eat(aBat);
			if(ant.getCurrentMealLog().equals(bat_eat)) {
				System.out.println("bat_eat PASSED TESTING");
			}else {
				System.out.println("bat_eat FAILED TESTING");
			}
		}
		
		public static void BatHasEatenOut() {
			Ant ant = new Ant(a_name);
			Bat aBat = new Bat(b_name);
			ant.eat(aBat);
			ant.whatDidYouEat();
			if (ant.getCurrentMealLog().equals(bat_hasEaten)) {
				System.out.println("bat_hasEaten PASSED TESTING");
			}else {
				System.out.println("bat_hasEaten FAILED TESTING");
			}

		}
		
		public static void FlyEatingOut() {
			Ant ant = new Ant(a_name);
			Fly aFly = new Fly(f_name);
			ant.eat(aFly);
			if (ant.getCurrentMealLog().equals(fly_eat)) {
				System.out.println("fly_eat PASSED TESTING");
			}else {
				System.out.println("fly_eat FAILED TESTING");
			}
		}
		
		public static void FlyHasEatenOut() {
			Ant ant = new Ant(a_name);
			Fly aFly = new Fly(f_name);
			ant.eat(aFly);
			ant.whatDidYouEat();
			if (ant.getCurrentMealLog().equals(fly_hasEaten)) {
				System.out.println("fly_hasEaten PASSED TESTING");
			}else {
				System.out.println("fly_hasEaten FAILED TESTING");
			}

		}
		
		public static void ThingEatingOut() {
			Ant ant = new Ant(a_name);
			Thing aThing = new Thing(t_name);
			ant.eat(aThing);
			if (ant.getCurrentMealLog().equals(thing_eat)) {
				System.out.println("thing_eat PASSED TESTING");
			}else {
				System.out.println("thing_eat FAILED TESTING");
			}

		}
		
		public static void ThingHasEatenOut() {
			Ant ant = new Ant(a_name);
			Thing aThing = new Thing(t_name);
			ant.eat(aThing);
			ant.whatDidYouEat();
			if (ant.getCurrentMealLog().equals(thing_hasEaten)) {
				System.out.println("thing_hasEaten PASSED TESTING");
			}else {
				System.out.println("thing_hasEaten FAILED TESTING");
			}

		}
		
		public static void TigerEatingOut() {
			Ant ant = new Ant(a_name);
			Tiger aTiger = new Tiger(tiger_name);
			ant.eat(aTiger);
			if (ant.getCurrentMealLog().equals(tiger_eat)) {
				System.out.println("tiger_eat PASSED TESTING");
			}else {
				System.out.println("tiger_eat FAILED TESTING");
			}
		}
		
		public static void TigerHasEatenOut() {
			Ant ant = new Ant(a_name);
			Tiger aTiger = new Tiger(tiger_name);
			ant.eat(aTiger);
			ant.whatDidYouEat();
			if (ant.getCurrentMealLog().equals(tiger_hasEaten)) {
				System.out.println("tiger_hasEaten PASSED TESTING");
			}else {
				System.out.println("tiger_hasEaten FAILED TESTING");
			}

		}
				
		public static void MovingOut() {
			Ant ant = new Ant(a_name);
			ant.move();
			if(ant.getMoveString().equals(move_out)) {
				System.out.println("move_out PASSED TESTING");
			}else {
				System.out.println("move_out FAILED TESTING");
			}
		}
		
		public static void HasNotEatenOut() {
			Ant ant = new Ant(a_name);
			if(ant.getCurrentMealLog().equals(hasNotEaten)) {
				System.out.println("hasNotEaten PASSED TESTING");
			}else {
				System.out.println("hasNotEaten FAILED TESTING");
			}
		}
}
