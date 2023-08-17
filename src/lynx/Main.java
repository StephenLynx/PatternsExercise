package lynx;

public class Main {

	public static void main(String[] args) {

		FruitCase fruits = FruitCase.getCase();

		fruits.fruit = new Banana();
		fruits.squeeze();

		fruits.fruit = new WaterMelon();
		fruits.squeeze();

	}

}
