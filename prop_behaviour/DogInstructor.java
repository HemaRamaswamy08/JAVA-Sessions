package prop_behaviour;

public class DogInstructor {

	public static void main(String[] args) {
		Dog hemasDog = new Dog();
		hemasDog.name = "Lucky";
		hemasDog.breedName = "Golden_Retriever";
		hemasDog.gender = "female";
		hemasDog.color = "gold";
		hemasDog.age = 1;
		
		Dog nishasDog = new Dog();
		nishasDog.name = "Rocky";
		nishasDog.breedName = "Indi";
		nishasDog.gender = "male";
		nishasDog.color = "black";
		nishasDog.age = 2;
		// calling method
		hemasDog.bark();
		hemasDog.sleep();
		nishasDog.bark();
		nishasDog.sleep();

	}

}
