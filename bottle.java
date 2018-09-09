package bottle;
import java.util.Scanner; 

public class bottle {
public static int amountPennies;  
private int pennies; 
static Scanner keyboard = new Scanner(System.in);
static final int MIN = 0;
 static void MAX() {
	 int MAX = 500; 
	 return; 
 }
 /*
  * (inPut) method will allow the user to enter 
  * an integer. The program will check if the number 
  * isn't less than zero. 
  */
  public static int amountOne;
public static int amountTwo; 
 public static int inPut(){
	 System.out.println("Enter two number for the bottle ");
	 amountOne = keyboard.nextInt(); 		
	 
		 if(amountOne >= MAX) {
	 		 System.out.println("That amount of pennies cannot fit in the bottle.\nPlease enter a another amount of pennies.");
	 		 amountOne = keyboard.nextInt();
	 	 }
		 else if (amountOne < MIN ){
			 System.out.println("Please enter a valid number");
		 amountOne = keyboard.nextInt(); 
		 
		 }
		 amountTwo = keyboard.nextInt(); 
		 if (amountTwo >= MAX) {
			 System.out.println("That amount of pennies cannot fit in the bottle.\nPlease enter a another amount of pennies.");
	 		 amountTwo = keyboard.nextInt();
		 }
		 else if (amountTwo < MIN) {
			 System.out.println("Please enter a valid number");
			 amountTwo = keyboard.nextInt(); 
			 
		 }
return amountOne;

 }//End of inPut Method 
 public int add(int bottleOne, int bottleTwo, int bottleThree){
	 bottleOne = amountPennies; 
	 
 }
 public void Bottle(){
	 
 }
 //public String NewBottle() {
	// return bottle;
 //}

}//End class

package bottle;
import java.util.Scanner; 

public class bottle {
public static int amountPennies;  
private static int pennies = 0; 
static Scanner keyboard = new Scanner(System.in);
static final int MIN = 0;
 static final int  MAX = 500;
 /*
 /*
  * (inPut) method will allow the user to enter 
  * an integer. The program will check if the number 
  * isn't less than zero. 
 ///
 static int amountOne;
 static int amountTwo; 
 public static int inPut(){
	 System.out.println("Enter a number for the bottle ");
	 amountOne = keyboard.nextInt(); 		
	 
		 if(amountOne >= MAX) {
	 		 System.out.println("That amount of pennies cannot fit in the bottle.\nPlease enter a another amount of pennies.");
	 		 amountOne = keyboard.nextInt();
	 	 }
		 else if (amountOne < MIN ){
			 System.out.println("Please enter a valid number");
		 amountOne = keyboard.nextInt(); 
		 
		 }
		 System.out.println("Enter another	 number for the bottle ");
		 amountTwo = keyboard.nextInt(); 
		 if (amountTwo >= MAX) {
			 System.out.println("That amount of pennies cannot fit in the bottle.\nPlease enter a another amount of pennies.");
	 		 amountTwo = keyboard.nextInt();
		 }
		 else if (amountTwo < MIN) {
			 System.out.println("Please enter a valid number");
			 amountTwo = keyboard.nextInt(); 
			 
		 }
		 
return amountOne + amountTwo; 

 }//End of inPut Method 
 public static int add(){ 
	 int bottleOne,  bottleTwo, bottleThree;
	 boolean TRUE = true;
	 bottleOne = amountOne; 
	 bottleTwo = amountTwo; 
	 do {		
		 bottleThree = bottleOne + bottleTwo; 
		 	if (bottleThree > MAX) {
		 		TRUE = false; 
		 		System.out.println("You can put " + bottleThree + " pennies in the bottle");
		 			if(bottleOne > bottleTwo) {
		 				System.out.println("Enter a smaller number than " + bottleOne + ".");
		 				bottleOne= keyboard.nextInt();
		 			}
		 			else {
		 				System.out.println("Enter a smaller number than " + bottleTwo +".");
		 				bottleTwo = keyboard.nextInt();
		 			} 
		 			
		 			
		 	}
	 }while(TRUE ==true );
	System.out.println(bottleThree);
	 return pennies; */
	
 //}
 
 //public String NewBottle() {
	// return bottle;
 //}

public static int read() {
	boolean STOP = true; 
	while(STOP == true) 
	{
	STOP = false; 
	pennies = keyboard.nextInt(); 
	if (pennies >= MAX) {
		STOP = true; 
		System.out.println("That amount of pennies cannot fit in the bottle.");
		pennies = keyboard.nextInt();
	}
	else if(pennies < MIN) {
		System.out.println("You cannot put a negative number in the bottle silly" );
		pennies = keyboard.nextInt(); 
		
	}

	}
	return pennies;

}//read 
public static  int getFirstNumber(int numberOne) {
	//System.out.println(numberOne);
	return  numberOne;
}//end getFirstNumber
public static int getSecondNumber(int numberTwo) {

	//System.out.println("Two" + numberTwo);
	return numberTwo; 
}//end getSecondNumber
public static  int add(int bottle1, int bottle2, int bottle3 ) {
	bottle1 = getFirstNumber(bottle1);  
	bottle2 = getSecondNumber(bottle2);
	bottle3 = bottle1 + bottle2; 
	//System.out.println(bottle3);
	return bottle3; 

}//end add 
public static int subtract(int bottle2 , int bottle1, int bottle3 ) {
	bottle1 = getFirstNumber(bottle1); 
	bottle2 = getSecondNumber(bottle2);
	System.out.println(bottle1);
	System.out.println(bottle2);
	if(bottle1 > bottle2) {
		bottle3 = bottle1 - bottle2;
		System.out.println("Subtract " + bottle1 + " from "+ bottle2 + "\nWill equals " 
		+ bottle3 + ".");
	}
	else if(bottle2> bottle1) {
		bottle3 = bottle2 - bottle1;
		System.out.println("Subtract " + bottle2+ " from "+ bottle1 + "\nWill equals " 
				+ bottle3 + ".");
	}
	else {
		bottle3= bottle1 - getSecondNumber(bottle2);
		System.out.println("Because " + getFirstNumber(bottle1) + " and " + bottle2 +
				" are equals it will be 0");
		
	}
	return bottle3 ;
}//end Subtract
public static int divide(int bottle1, int bottle2, int bottle3, int bottle4 ) {
	
	bottle1 = getFirstNumber(bottle1);
	bottle2 = getSecondNumber(bottle2);
	bottle3 = bottle1 + bottle2; 
	bottle4 = bottle3 / 2; 
	
	return bottle4; 
}//End divide 

}//End class

