package lynx;

public class WaterMelon implements Fruit {

	private int seeds = 10;

	public void pickSeeds() {
		seeds = 0;
	}

	@Override
	public void squeeze() {

		if (seeds > 0) {
			System.out.println("You can't squeeze the piece of watermelon without taking the seeds first.");
		} else {
			System.out.println("You squeeze a piece of the watermelon, juices dripping all over the floor.");
		}

	}

}
