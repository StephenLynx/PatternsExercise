package lynx;

public class FruitCase {
	private static FruitCase instance;

	private FruitCase() {
		super();
	}

	public Fruit fruit;

	public void squeeze() {
		if (fruit != null) {
			fruit.squeeze();
		}
	}
	
	public void makeSmoothie(WaterMelon melon, Banana banana) {
		
		banana.prepare();
		melon.pickSeeds();
		
		System.out.println("Smoothie prepared.");
		
	}

	public static FruitCase getCase() {

		if (instance == null) {
			instance = new FruitCase();
		}

		return instance;
	}

}
