package test.java;

public class ExecuteTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AntTest.AntEatingOut();
		AntTest.AntHasEatenOut();
		AntTest.BatEatingOut();
		AntTest.BatHasEatenOut();
		AntTest.FlyEatingOut();
		AntTest.FlyHasEatenOut();
		AntTest.ThingEatingOut();
		AntTest.ThingHasEatenOut();
		AntTest.TigerEatingOut();
		AntTest.TigerHasEatenOut();
		AntTest.MovingOut();
		AntTest.HasNotEatenOut();
		
		System.out.println();
		
		BatTest.AntEatingOut();
		BatTest.AntHasEatenOut();
		BatTest.BatEatingOut();
		BatTest.BatHasEatenOut();
		BatTest.FlyEatingOut();
		BatTest.FlyHasEatenOut();
		BatTest.TigerEatingOut();
		BatTest.TigerHasEatenOut();
		BatTest.MovingOut();
		BatTest.testFlyingExpectedOutput();
		BatTest.HasNotEatenOut();
		
		System.out.println();

		FlyTest.ThingEatingOut();
		FlyTest.ThingHasEatenOut();
		FlyTest.MovingOut();
		BatTest.HasNotEatenOut();

		System.out.println();

		ThingTest.stringTest();
		
		System.out.println();

		TigerTest.AntEatingOut();
		TigerTest.AntHasEatenOut();
		TigerTest.BatEatingOut();
		TigerTest.BatHasEatenOut();
		TigerTest.FlyEatingOut();
		TigerTest.FlyHasEatenOut();
		TigerTest.ThingEatingOut();
		TigerTest.ThingHasEatenOut();
		TigerTest.TigerEatingOut();
		TigerTest.TigerHasEatenOut();
		TigerTest.MovingOut();
		TigerTest.HasNotEatenOut();
	
	}

}
