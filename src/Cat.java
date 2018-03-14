/* Animal is the super class
 * which explain why cat extends Animal and become a sub class on the type Animal.
 * which is also called inheritance because every single field and methods of the Animal class 
 * are going to be available to Cat class
 */
public class Cat extends Animal{
	
	//create constructor
	public Cat() {}
		
	/* now we are going to overwrite that makeSound method from the super class Animal
	 * to make the sounds Woof!! instead
	 */
	public String makeSound() {
		return "Moewww";
	}

	public static void main(String[] args) {
		
		Animal rex = new Dog();
		Animal meli = new Cat();
		Animal brat = new Dog();
		
		/* we going to create an array of Animal which will be the easy the store 
		 * multiple animals of the same data type
		 */
		Animal[] myAnimals = new Animal[10];
		
		myAnimals[0] = rex;
		myAnimals[1] = meli;
		
		System.out.println("Rex says " + myAnimals[0].makeSound());
		System.out.println("meli says " + myAnimals[1].makeSound());
		
		speakAnimal(brat);
	}
}
