public class PetTest {

	public static void main(String[] args) {
		testConstructor();
		testNicknames();
		testEquals1();
		testEquals2();
		testEquals3();
		testEquals4();
	}

	private static void testConstructor() {
		Pet rex = new Pet("Rex", 4, 2, "dog", true);
		if(!rex.getName().equals("Rex")) {
			System.out.println("testConstructor failed");
			return;
		}
		if(!rex.getSpecies().equals("dog")) {
			System.out.println("testConstructor failed");
			return;
		}
		if(rex.getAge() != 4) {
			System.out.println("testConstructor failed");
			return;
		}
		if(!rex.isHouseTrained()) {
			System.out.println("testConstructor failed");
			return;
		}
		System.out.println("testConstructor passed");
	}
	
	private static void testNicknames() {
		Pet rex = new Pet("Rex", 4, 2, "dog", true);
		if(rex.hasNickname("Rex")) {
			System.out.println("testNicknames1 failed");
			return;
		}
		
		rex.addNickname("T-Rex");
		if(!rex.hasNickname("T-Rex")) {
			System.out.println("testNicknames2 failed");
			return;
		}
		
		rex.addNickname("Rext");
		if(!rex.hasNickname("Rext")) {
			System.out.println("testNicknames3 failed");
			return;
		}
		
		rex.addNickname("Rext");
		if(!rex.hasNickname("Rext")) {
			System.out.println("testNicknames4 failed");
			return;
		}
		System.out.println("testNicknames passed");
	}
	
	private static void testEquals1() {
		Pet spot = new Pet("Rex", 4, 2, "dog", true);
		Pet rex = new Pet("Rex", 4, 2, "dog", true);
		if(spot.equals(rex)) {
			System.out.println("testEquals1 passed");
		} else {
			System.out.println("testEquals1 failed");
		}
	}
	
	private static void testEquals2() {
		Pet spot = new Pet("Rex", 4, 2, "dog", true);
		Pet rex = new Pet("Rex", 4, 2, "dog", false);
		if(spot.equals(rex)) {
			System.out.println("testEquals2 passed");
		} else {
			System.out.println("testEquals2 failed");
		}
	}
	
	private static void testEquals3() {
		Pet spot = new Pet("Spot", 4, 2, "dog", true);
		Pet rex = new Pet("Rex", 4, 2, "dog", true);
		if(!spot.equals(rex)) {
			System.out.println("testEquals3 passed");
		} else {
			System.out.println("testEquals3 failed");
		}
	}
	
	private static void testEquals4() {
		Pet spot = new Pet("Rex", 4, 2, "dog", true);
		Pet rex = new Pet("Rex", 4, 2, "dog", true);
		rex.addNickname("T-Rex");
		spot.addNickname("Spot");
		if(spot.equals(rex)) {
			System.out.println("testEquals4 passed");
		} else {
			System.out.println("testEquals4 failed");
		}
	}

}
