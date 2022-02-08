package testing;

import main.Fly;
import main.Thing;

public class FlyTest {
	// String fixtures		
		private final static String f_name;	
		
		private final static String t_name;
		private final static String thing_eat;
		private final static String thing_hasEaten;
		
		private final static String move_out;
		private final static String hasNotEaten;
			
		static {
			f_name = "Flyski";

			t_name = "Thing1";
			thing_eat = f_name + " Fly has just eaten a Thing" ;
			thing_hasEaten = f_name + " Fly has eaten a Thing";
			
			
			move_out = f_name + " Fly is buzzing around in flight.";
			hasNotEaten = f_name + " Fly has had nothing to eat!";
		}
			
		
		public static void ThingEatingOut() {
			Fly fly = new Fly(f_name);
			Thing theThing = new Thing(t_name);
			fly.eat(theThing);
			if (fly.getCurrentMealLog().equals(thing_eat)) {
				System.out.println("thing_eat PASSED TESTING");
			}else {
				System.out.println("thing_eat FAILED TESTING");
			}

		}
		
		public static void ThingHasEatenOut() {
			Fly Fly = new Fly(f_name);
			Thing theThing = new Thing(t_name);
			Fly.eat(theThing);
			Fly.whatDidYouEat();
			if (Fly.getCurrentMealLog().equals(thing_hasEaten)) {
				System.out.println("thing_hasEaten PASSED TESTING");
			}else {
				System.out.println("thing_hasEaten FAILED TESTING");
			}

		}
		
						
		public static void MovingOut() {
			Fly Fly = new Fly(f_name);
			Fly.move();
			if(Fly.getMoveString().equals(move_out)) {
				System.out.println("move_out PASSED TESTING");
			}else {
				System.out.println("move_out FAILED TESTING");
			}
		}
		
		public static void HasNotEatenOut() {
			Fly Fly = new Fly(f_name);
			if(Fly.getCurrentMealLog().equals(hasNotEaten)) {
				System.out.println("hasNotEaten PASSED TESTING");
			}else {
				System.out.println("hasNotEaten FAILED TESTING");
			}
		}
}
