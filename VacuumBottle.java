
public class VacuumBottle {
	private Temperature temp = new Temperature(); 
	private Bottle bottle = new Bottle(); 
	public static void main(String [] args) {
		int [] firstArray = new int [(int) Math.random()*5+1]; 
		int [] secondArray = new int [(int) Math.random() * 5 +1];
		int [] thirdArray = new int [(int) Math.random()*5+1];
	}
	VacuumBottle(){
		this.temp = new Temperature( 0, ""); 
		this.bottle = new Bottle( 0); 
		
	}
		 
	VacuumBottle(int value){
		
		bottle = new Bottle(value); 
	}
	
	public VacuumBottle add(VacuumBottle value) {
		VacuumBottle answer; 
		double tempo; 
		answer = this.temp + value.temp;  
		return value; 
	}
	public VacuumBottle subtract(VacuumBottle value) {
		return value;
	}
	public VacuumBottle divide(int value) {
		VacuumBottle answer; 
		
		return answer = new VacuumBottle(value);
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
	public static VacuumBottle average(int [] array) {
		VacuumBottle answer; 
		int i= 0;
		return answer = new VacuumBottle(i) ;
	}
	public static void printVacuumBottle(Bottle [] array) {
		for(int x = 0; x < array.length; x++ ) {
			System.out.print("The value of " + x + "is equals to");
			System.out.println(array[x]);
		}
		 
	}
	public static VacuumBottle copyLargestArray(VacuumBottle []arrayOne, VacuumBottle [] arrayTwo, VacuumBottle [] arrayThree) {
		return arrayOne;
	
	}
	
	public static VacuumBottle largestArray(VacuumBottle arrayOne, VacuumBottle [] arrayTwo, VacuumBottle [] arrayThree) {
	
		return arrayOne; 
	
	}
	
}
