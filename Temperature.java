
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
	private double temp; 
	private String scale; 
	static final double absoluteFahrenheit = -456.67; 
	static final double absoluteKelvin = 0; 
	static final double absoluteCelsius = -273.15; 
	Scanner keyboard = new Scanner(System.in);

	public void read() {
		temp = keyboard.nextDouble(); 
		System.out.println("Please enter the type of temperature C for Celsius, F for Fahrenheit, K for Kelvin");
		scale = keyboard.nextLine(); 
		while(!scale.equalsIgnoreCase("C")||!scale.equalsIgnoreCase("F")||!scale.equalsIgnoreCase("K")) {
			System.out.println("Enter a correct type of Temperature");
			scale = keyboard.nextLine(); 
		}
			}//End read 
		Temperature() {
			this.temp = 0;
			this.scale = "" ; 
		
	}//default constractore 
		Temperature(double temperature, String scale1){
			this.temp = temperature; 
			this.scale = scale1; 
			
		}
	/*private void set(Temperature value) {	
		Temperature  = value.get(); 

		
	}//End Set*/
	private void set(double value) {
		temp= value; 
	}
	
	public void setScale(String typeTemp) {
		typeTemp = scale;
	}
	public double get() {
	 
		return this.temp; 
	}
	public Temperature add(Temperature value) {
		Temperature answer = null;  
		//Temperature Scale = new Temperature(); 
		double addingDegree;
		switch(this.scale) {
		case"K": 	
		
			answer = (value.toCelsius()); 
			break; 
		case"C":			
			value = value.toCelsius(); 
			addingDegree = (value.get() + this.temp);
			System.out.println("This is value.get" + value.get());
			answer = new Temperature(addingDegree, "C"); 
			//answer.set(answer + Scale.getScale());
			break; 
		case"f": 
			value = value.toFahrenheit();
			addingDegree = (value.get() + this.temp);
			answer = new Temperature(addingDegree, "F"); 
		default: 
			System.out.println("Thats not a valid type of temperature.");
			System.exit(0);
		}	
		return answer; 
	}//End Add
	public Temperature subtract(Temperature value) {
		Temperature answer = new Temperature();
		Temperature temp1 = new Temperature(); 
		switch(this.scale){
		case"K": 
			answer.set(value.get()- this.temp );
			break; 
		case"C": 
			answer.set(value.get()- this.temp);
			break; 
		case"F": 
			answer.set(value.get()- this.temp); 
			break; 
		default: 
			System.out.println("That's not a valid type of temoerature");
			System.exit(0);
		
		}
		Double temperature = this.temp; 
		Double kelvin = (double)274.15; 
		if(scale.equalsIgnoreCase("C")) {
		answer.set(temperature - kelvin);
		}
		return answer; 
	}//End Subtract
	public Temperature multiply(Temperature value) {
		Temperature answer= new Temperature(); 
		switch(this.scale) {
			case"K": 
				answer.set(value.get() *this.temp);
				break; 
			case"C": 
				answer.set(value.get()* this.temp);
				break; 
			case"F": 
				answer.set(value.get() *this.temp);
				break; 
			default: 
				System.out.println("That's not a valid type of temoerature");
				System.exit(0);
		}
		return answer; 
	}//End Multiply 
	public Temperature divide(Double value) {
		Temperature answer; 
		double degree;  
		switch(this.scale) {
		case"K": 
			degree= ( this.temp / value); 
			answer = new Temperature(degree, "K"); 
			break;
		case"C": 
			answer.set( this.temp/ value);
			break; 
		case"F": 
			answer.set(this.temp/ value);
			break;
		default: 
			System.out.println("That's not a valid type of temoerature");
			System.exit(0);
		}
		
		return answer; 
	}//End Divide 
	public boolean equals(Temperature temperature) {
		boolean answer = true;
		Temperature checker = new Temperature(); 
		checker.set(this.temp);
		if(checker == temperature) {
			answer = false; 
			return answer;
		}
		return answer;
	}//End equals
	public boolean greaterThan(Temperature temperature) {
		boolean answer = true; 
		
		return answer; 
	}//End greaterThan
	public Temperature toKelvin() {
		Temperature answer = null;
		double degree; 
		//Temperature Scale = new Temperature(); 
		//Scale.getScale(); 
		//K to C: K - 273.15 
		//K to F: (K - 273.15) * 9/5 + 32 
		double kelvin = 273.15; 
		//double answer; 
		switch(this.scale) {
		case "C": 
			
			degree = (this.temp + 273.15); 
			answer = new Temperature(degree, "K");
			
			//answer.set(answer + Scale.getScale());
			
			break; 
		case "F": 
			//Scale.getScale(); 
			degree = (this.temp - 273.15) * (9/5) + 32; 
			answer = new Temperature (degree, "K");
			break; 
		case "K": 
			//Scale.getScale(); 
			//answer.set (this.temp); 
			//answer.set(answer + Scale.getScale());
			answer = new Temperature(this.temp, this.scale);
			break; 
			default: 
				System.out.println("That Type of Temoerature does not exist");
		
		}
		
		return answer;  
	}//End toKelvin 


	private void set(String string) {
		// TODO Auto-generated method stub
		
	}
	public Temperature toCelsius() {
		//C to K: C + 273.15 
		//C to F: (C * 9/5) + 32 
		Temperature answer = null; 
		double degree; 
		switch(this.scale) {
		case "K": 
			degree = (this.temp + 273.15);
			answer = new Temperature(degree, "C");
			break; 
		case "F": 
			degree = ((this.temp - 32) * 5/9);
			answer = new Temperature( degree , "C"); 
			break; 
		case"C" : 
			answer = new Temperature(this.temp, this.scale);
			break; 
			default: 
				System.out.println("The answer is equals to " );
			
		}
	
		return answer; 
	}//End toCelsius
	public Temperature toFahrenheit() {
		double celcius =  32 ;
		double fraction = 5/9;
		double degree; 
		
		//F to C: (F - 32) * 5/9 
		//F to K: (F - 32) * 5/9 + 273.15 
		Temperature answer = null; 
		switch(this.scale) {
		case "C": 
			degree = ( (this.temp - celcius)*(fraction));
			answer = new Temperatue(degree, "F"); 
			
			break; 
		case "K": 
			degree = ((this.temp - celcius)*(fraction) + 273.15);
			answer = new Temperature(degree, "F");
			break; 
		case "F": 
			answer = new Temperature(this.temp, this.scale); 
			break;
			default: 
				System.out.println("That's not a valid type of Temperature"); 
				System.exit(0);
		}
		return answer; 
	}//ToFahrenheit
	
	public String toString() {
		
		return  this.temp + ""+ this.scale; 
	}//End toString 
}//End of Class

