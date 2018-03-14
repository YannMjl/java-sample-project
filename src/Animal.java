import java.util.*;

public class Animal {
	/* public : this is available to anyone 
	 * static : this is going to be access by every Animal Objects created
	 * final : means it is constant and cannot be changed
	 * private : can be access by other methods in the class and that's it.
	 * protected : means can be only access by other code inside the same package
	 * variable or fields in java can start with either : an underscore, letter or a $ sign
	 */
	
	public static final double number = 1.958;
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userinput = new Scanner(System.in);        // Scanner allows user to enter input

	public Animal() {
		// Animal is the super class because it is extended by Cat and Dog classes
		super(); // this line can be remove and will not affect the execution 
		
		numberOfAnimals++;
		
		// math operations
		int sumOfNumbers = 5 + 1;
		int diffOfNumbers = 5 - 1;
		int mulOfNumbers = 5 * 1;
		int divOfNumbers = 5 / 1;
		int modOfNumbers = 5 % 3;
		System.out.println(" 5 + 1 = " + sumOfNumbers);
		System.out.println(" 5 - 1 = " + diffOfNumbers);
		System.out.println(" 5 * 1 = " + mulOfNumbers);
		System.out.println(" 5 / 1 = " + divOfNumbers);
		System.out.println(" 5 % 3 = " + modOfNumbers);
		
		System.out.println(" Enter the name of the Animal: ");
		
		/* hasNextLine checks if the user did enter a string
		 * hasNextInt is used if the user is going to be entering integers 
		 * hasNextFloat if we are expecting float
		 * hasNextDouble for double
		 * hasNextBoolean for boolean
		 * hasNextByte for byte
		 * and returns true is the user enter the correct data type.
		 * same for nextLine, nextInt, nextFloat, nextDouble, nextBoolen...
		 */
		if(userinput.hasNextLine()) {                        // nextLine get the value enter by the user
			this.setName(userinput.nextLine());              // "this" refer to the 'myAnimal" object that was created
		}
		
		// this is how function call is made
		this.setFavoriteChar(); 
		this.setUniqueID();
	}
	
	//***********************************************************************************************************************/
	// these are getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	//**************************************************************************/
	/* these two function are example of method overloading
	 * which just means that different attributes or data type can be send 
	 * with a a same function name.
	 */
	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}
	
	public void setUniqueID() {
		int minNumber = 1;
		int maxNumber = 1000000;
		
		/* (int) in this context is casting
		 * math.random returns a double, (int) convert that value to integer
		 * and casting change type for primitive data types.
		 * the same goes for (byte) and (long)
		 */
		this.uniqueID = minNumber + (int) (Math.random() * ((maxNumber - minNumber) + 1 ));
		
		// data types conversion examples
		String stringNumber = Integer.toString(maxNumber);
		int numberString = Integer.parseInt(stringNumber);
		
		System.out.println("Unique ID set to: " + this.uniqueID);
	}
	
	public void setFavoriteChar() {
		int randomNumber = (int) (Math.random() * 126) + 1;
		
		this.favoriteChar = (char) randomNumber;
		
		if(randomNumber == 32) {
			System.out.println("Favorite character set to Space");
		}
		else if(randomNumber == 10) {
			System.out.println("Favorite character set to new line");
		}
		else {
			System.out.println("Favorite character set to " + this.favoriteChar);
		}
		
		/* logical operator are also used in if statement
		 * !  : (not) this also convert a boolean value to its opposite
		 * &  : (and) returns true if boolean value on the right and left are both true
		 * && : (and) returns true if boolean value on the right and left are both true except it stops evaluating after the first false
		 * |  : (or) returns true if either boolean value on the right or left is true
		 * || : (or) returns true if either boolean value on the right and left is true except it stops evaluating after the first false
		 * ^  : returns true if there is one true and one false
		 */
		if((randomNumber > 97) && (randomNumber < 122)) {
			System.out.println("Favorite character set to is a lowercase letter");
		}
		
		if(((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))) {
			System.out.println("Favorite character set to is a letter");
		}
		
		/* another comparison is the internally operator
		 * if randomNumber is less than 50, whichIsbigger is going to be set to 50 
		 * if randomNumber is greater than 50, whichIsbigger is going to be set to randomNumber value
		 */
		int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
		
		switch(randomNumber) {
		
			/* Int, byte, character, or string (for java 7 and above) can be used in the switch statement
			 * 'a'    : to evaluate character 
			 * "name" : to evaluate String
			 */
			case 8:
				System.out.println("Favorite character set to backspace");
				break;  // break throws you out of the switch statement
				
			case 10:
			case 11:
			case 12:
				System.out.println("Favorite character set to backspace");
				break;  // break throws you out of the switch statement
			
			default :   // if none of the above case happen
				System.out.println("hi");
				break;  
		
		}
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	//**************************************************************************/
	
	public char getFavoriteChar() {
		return favoriteChar;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	//***********************************************************************************************************************/
	/* Now let create some different functions
	 * which also demonstrate loops
	 * void : in a function means it doean't return anything
	 */
	protected static void counter(int startNumber) {
		for (int i = startNumber; i <= 100; i++) {
			if(i == 90) continue;
			
			System.out.println(i);
		}
	}
	
	protected static String printNumber(int maxNumbers) {
		int number = 1;
		
		while(number < (maxNumbers /2)) {
			System.out.println(number);
			number++;
			
			// if you want to jump outside of the loop completely
			if(number == (maxNumbers/2)) break;
		}
		
		// passing an argument to a function
		Animal.counter(maxNumbers/2);
		
		return "End of printNumber";
		
	}
	
	protected static void guessMyAge() {
		int number;
		
		do {
			System.out.println("Guess my age and enter a number up to 100: ");
			
			while(!userinput.hasNextInt()) {
				String numberEntered = userinput.next();
				System.out.printf("%s is not a number\n", numberEntered);
			}
			
			// in case the user enter a number
			number = userinput.nextInt();
			
		} while(number != 27); // this is going to run until the user enter number 27
		
		System.out.println("Yayy!!! you guessed the right number");
	}
	
	//***********************************************************************************************************************/
	/* this function are going to demonstrate the concept of polymorphism
	 * 
	 */
	public String makeSound() {
		return "GRrrrRRRrrrr";
	}
	
	public static void speakAnimal(Animal randAnimal) {	
		System.out.println("Animal says " + randAnimal.makeSound());
	}
	
	//***********************************************************************************************************************/
	/*this is where are code is going to be executed
	 * whenever we call for the program to run, this is the function that is going to be executed first
	 */
	public static void main(String[] args) {
		
		// create new animal object
		Animal myAnimal = new Animal();
		
		// create an array fo integers and initialize an array
		int[] myNumbers = new int[20];
		myNumbers[0] = 4;
		
		String[] stringsArray = {"here", "we", "go", "again"};
		
		// now let cycle through the array
		for(String word : stringsArray) {
			System.out.println(word);
		}
		
		// let coopy an array
		String [] copyArray = Arrays.copyOf(stringsArray, 4);
		
		// print the entire array
		System.out.println(Arrays.toString(copyArray));
		
		// search for item in an array
		System.out.println(Arrays.binarySearch(copyArray, "go"));
	}
	
}
