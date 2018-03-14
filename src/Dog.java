/* Animal is a super class
 * and Dog extends Animal and become a sub class on the type Animal
 * which also implement inheritance. 
 */
public class Dog extends Animal{

	//create constructor
	public Dog() {}
	
	/* now we are going to overwrite that makeSound method from the super class Animal
	 * to make the sounds Woof!! instead
	 */
	public String makeSound() {
		return "Wooofoofff";
	}
}
