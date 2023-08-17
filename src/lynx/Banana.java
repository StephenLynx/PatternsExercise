package lynx;

public class Banana implements Fruit {

	private boolean peel = true;

	public void prepare() {
		peel = false;
	}

	public void squeeze() {
		if (peel) {
			System.out.println("You can't squeeze the banana without taking the peel first.");
		} else {
			System.out.println("You squeeze the banana, making a mush that sticks to your hand.");
		}
	}

}
