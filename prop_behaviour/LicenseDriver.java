package prop_behaviour;

public class LicenseDriver {

	public static void main(String[] args) {
		// first applicant
		Dog hemasDog = new Dog();
		hemasDog.name = "Lucky";
		hemasDog.breedName = "Golden_Retriever";
		hemasDog.gender = "female";
		hemasDog.color = "gold";
		hemasDog.age = 1;

		// second applicant
		Dog NishasDog = new Dog();
		NishasDog.name = "Rocky";
		NishasDog.breedName = "Indi";
		NishasDog.gender = "male";
		NishasDog.color = "black";
		NishasDog.age = 2;
		
		System.out.println(hemasDog.name);
		System.out.println(hemasDog.breedName);
		System.out.println(hemasDog.gender);

		System.out.println(NishasDog .name);
		System.out.println(NishasDog .breedName);
		System.out.println(NishasDog .gender);
	}

}
