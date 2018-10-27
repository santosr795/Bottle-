
public class TemperatureArray {
	TemperatureArray(int tempValue) {
	
	}
	TemperatureArray(Temperature ArrayOne, Temperature ArrayTwo, Temperature ArrayThree) {
		
	}
	
	public static void readTemparetureArray(Temperature [] array) {
		/*
		 * Create a static void method
		 *  that has an array parameter 
		 *  and is called 3 times to 
		 *  read in Temperature values for
		 *   each array.
		 */
		Temperature newArray;
		for(int x = 0; x< array.length; x++) {
			newArray = new Temperature(); 
			newArray.read(); 
			array[x] = newArray; 
			
		}
	}
	public void PrintTemperatureArray(Temperature [] TempArray) {
		/*
		 Create a static method that
		  prints the Temperatures of
		  an array.

		 */
		for(int x = 0; x < TempArray.length; x++) {
			System.out.println(TempArray[x]);
			
		}
		
	}
	public static TemperatureArray average(Temperature [] TempArray) {
		/*
		 * Create a static method that computes and 
		 * returns the average for each array
		 *  and is also called 3 times.
		 */
	
		TemperatureArray average; 
		int Sum = 0; 
		for(int x = 0; x < TempArray.length; x++ ) {
			
			Sum = Sum  ;
		}
		return average = new TemperatureArray(TempValue); 
	}
	public static TemperatureArray LargerArray(Temperature [] arrayOne, Temperature [] arrayTwo, Temperature [] arrayThree) {
		/*Create a static helper method that 
		 * has 3 array parameters and either
		 *  returns the largest array or the 
		 *  largest size. 
		*/
		TemperatureArray answer; 
		int TempValue = 0; 
		
		return answer = new TemperatureArray(TempValue); 
	}
	public static TemperatureArray newArray(TemperatureArray arrayOne, TemperatureArray arrayTwo, TemperatureArray arrayThree) {
		/*
		 * Create a static method that returns an array 
		 * of Temperatures that has the same number of
		 *  elements as the largest of the three arrays.
		 * This method will have 3 array parameters and 
		 * possibly an integer parameter.  It determines
		 *  the largest Temperature value from the three
		 *arrays at each index and creates a copy of this
		 * Temperature and stores it at that index of the 
		 *  new array. This array is then returned.

		 */
		return arrayOne; 
	}
	
}
