
import java.util.Arrays;

public class VacuumBottle {
	private Temperature temp = new Temperature(); 
	private Bottle bottle = new Bottle(); 
	 Bottle  [] firstArray = new Bottle [(int) Math.random()*5+1]; 
		Bottle [] secondArray = new Bottle [(int) Math.random() * 5 +1];
		Bottle [] thirdArray = new Bottle [(int) Math.random()*5+1];
	public static void main(String [] args) {
		
	}
	VacuumBottle(){
		this.temp = new Temperature( 0, ""); 
		this.bottle = new Bottle( 0); 
		
	}
		 
	
	VacuumBottle(Bottle bottle2) {
		Bottle pennies = null;
		pennies.set(bottle2);
		}
	VacuumBottle(int value ){
		Bottle pennies= null; 
		pennies.set(value);		
	}
	public VacuumBottle add(VacuumBottle value) {
		VacuumBottle answer; 
		double tempo; 
		  
		return value; 
	}
	public VacuumBottle subtract(VacuumBottle value) {
		return value;
	}
	public VacuumBottle divide(int value) {
		VacuumBottle answer; 
		
		return answer;
	}
	public boolean equals(VacuumBottle value) {
		return true;
	}
	public boolean greaterThan(VacuumBottle value) {
		return true; 
	}
	public static void readVacuumBottle(Bottle []array) {
		System.out.println("This array has " + array.length + " elements.");
		Bottle t1;
		for(int x = 0; x < array.length; x++)
		{
			t1 = new Bottle();
			t1.read();
			array[x] = t1;
		}
	}
	public static double average(Bottle [] array) {
		double answer; 
		double sum = 0 ; 
		int i= 0;
		for(int x = 0; x < array.length;x++) {
			Bottle passArray = array[x]; 
			Double value =  new Double(passArray.toString());
			sum = sum + value; 
		} 
		double average; 
		 
		return average = sum/array.length; 
	}
	public static void printVacuumBottle(Bottle [] array) {
		for(int x = 0; x < array.length; x++ ) {
			System.out.print("The value of " + x + "is equals to");
			System.out.println(array[x]);
		}
		 
	}
	public static Bottle[] copyLargestArray(Bottle[] arrayOne, Bottle [] arrayTwo, Bottle [] arrayThree) {
		Bottle [] newArray ; 
		if (arrayOne.length > arrayTwo.length && arrayOne.length > arrayThree.length) {
	
			newArray = arrayOne.clone();
		}
		
		else if (arrayTwo.length > arrayOne.length && arrayTwo.length > arrayThree.length) 
		{
			newArray = arrayTwo.clone(); 
		}
		else if (arrayThree.length > arrayOne.length && arrayThree.length > arrayTwo.length)
		{
			newArray = arrayTwo.clone(); 
		}
			return newArray; 
	}
	
	public static Bottle[] largestArray(Bottle []arrayOne, Bottle [] arrayTwo, Bottle [] arrayThree) {
		if (arrayOne.length > arrayTwo.length && arrayOne.length > arrayThree.length) {
		
		}
		
		else if (arrayTwo.length > arrayOne.length && arrayTwo.length > arrayThree.length) 
		{
			
		}
		else if (arrayThree.length > arrayOne.length && arrayThree.length > arrayTwo.length)
		{
			
		}
		return arrayOne; 
	
	}
	
}
