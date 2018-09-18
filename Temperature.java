
import java.util.Scanner; 
/*
 * Project 2 Write a Temperature class. 
 * The class will have three conversion methods: 
 * toCelsius(), toKelvin() and toFahrenheit(). 
 * Thesemethods will return a Temperature in those 
 * three scales equal to the this temperature.
 *  Note that the value of this is not changed in
these conversions. In addition to these three conversion
 methods the class will have methods add(Temperature),
subtract(Temperature), multiply(Temperature), and divide(double).
 These four methods all return a temperature equaled to 
the respective operation. The returned type is that of the 
this. Note that the this value is not changed in these 
operations. Two boolean methods equals(Temperature), 
and greaterThan(Temperature) will return true if the 
this is greater than the parameter. Your class should 
include a read() method and a toString() method.
Remember methods add, subtract, multiply, divide and 
the three conversion methods all return a Temperature.
 Include at least two constructors: a default constructor
  and an explicit constructor. You must use a private 
  helper method called set() that takes the parameters
 of the constructor and tests for appropriate values for 
each possible scale. The set method is a void method.
This private set() method can be used to guarantee
temperature values are in the proper range. 
The add(), subtract(), multiply(), and divide() methods
 can call the constructor which calls the set() method. 
 The set method will check the degree value and if  
 it is in the proper range a new Temperature will be
  made to be returned by the add() method, subtract() 
  method, multiply() method and divide() method. 
A switch statement should be used throughout this class when
choosing between “C”, “F”, and “K”. Absolute zero for
 Kelvin is 0, for Fahrenheit -459.67, and for 
 Celsius -273.15. Your program must guarantee this absolute
  value is not violated. For the equals() method consider
   changing the this temperature and the parameter
temperature to the same scale and then testing the 
degree value for equality.
-------------------------------------
Program what must include 
- toKelvin() Method 
- toCelsius() Method 
- ToFahrenheit() Method 
- add(Temperature) Method 
- subtract(Temperature) Method 
- divide(boolean) Method 
- multiply(Temperature) Method 
- greaterThan(Temperature) 
- equal(Temperature) Method 
- Private set()Method parameter takes constructor

- Two Constructor a default 

- read() Method in read method include a statement to check
  for the type of Temperature
  
- A switch Statement
- 
 */
public class Temperature {
	private double Temperature = 0; 
	private String typeTemperature; 
	static final double absoluteFahrenheit = -456.67; 
	static final double absoluteKelvin = 0; 
	static final double absoluteCelsius = -273.15; 
	Scanner keyboard = new Scanner(System.in);

	public void read() {
		Temperature = keyboard.nextDouble(); 
		System.out.println("Please enter the type of temperature C for Celsius, F for Fahrenheit, K for Kelvin");
		typeTemperature = keyboard.nextLine(); 
		while(!typeTemperature.equalsIgnoreCase("C")||!typeTemperature.equalsIgnoreCase("F")||!typeTemperature.equalsIgnoreCase("K")) {
			System.out.println("Enter a correct type of Temperature");
			typeTemperature = keyboard.nextLine(); 
		}
			}//End read 
	public Temperature() {
		
	}
	private void set(double value) {	
		
		if(typeTemperature.equalsIgnoreCase("C") && Temperature < absoluteCelsius) {
			System.out.println("That's below the absolute zero of Celsius"); 
			System.exit(0); 
		}
		else if(typeTemperature.equalsIgnoreCase("F")&& Temperature < absoluteFahrenheit ){
			System.out.println("That's below the absolute zero of Fahrenheit");
			System.exit(0); 
		}
		else if(typeTemperature.equalsIgnoreCase("K")&& Temperature < absoluteKelvin) {
			System.out.println("That's below the absolute zero of Kelvin");
			System.exit(0);
		}
		Temperature = value;
	}//End Set
	public double get() {
		return Temperature; 
	}
	public Temperature add(Temperature value) {
		Temperature answer = new Temperature(); 
		answer.set( this.Temperature + value.get()); 
		return answer; 
	}//End Add
	public Temperature subtract(Temperature value) {
		Temperature answer = new Temperature();
		answer.set(this.Temperature-value.get());
		return answer; 
	}//End Subtract
	public Temperature multiply(Temperature value) {
		Temperature answer= new Temperature(); 
		answer.set(this.Temperature * value.get());
		return answer; 
	}//End Multiply 
	public Temperature divide(Double value) {
		Temperature answer = new Temperature(); 
		
		return answer; 
	}//End Divide 
	public boolean equals(Temperature temperature) {
		boolean answer = true; 
		return answer; 
	}//End equals
	public boolean greaterThan(Temperature temperature) {
		boolean answer = true; 
		return answer; 
	}//End greaterThan
	public double toKelvin() {
		double answer = 0;
		double kelvin = 457.87; 
		if( typeTemperature.equals("C")) {
		answer= this.Temperature* kelvin; 
		}
		return answer; 
	}//End toCalvin 

	public int toCelsius() {
		int answer = 0; 
		
		return answer; 
	}//End ToKelvin
	public int toFahrenheit() {
		int answer = 0 ; 
		
		return answer; 
	}//ToFahrenheit
	public void writeOut(){
		switch(typeTemperature) {
		case "F": System.out.println(toFahrenheit());
		break; 
		case "C": System.out.println(toCelsius());
		break; 
		case "K": System.out.println(toKelvin);
		}
	}
	public String toString() {
		
		return ""; 
	}//End toString 
}//End of Class
