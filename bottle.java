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
  public static int inPut(){
	 int amount = 0; 
	 System.out.println("Enter two number for the bottle t");
	 amount = keyboard.nextInt(); 	
	
		
		 if(amount >= MAX) {
	 		 System.out.println("That amount of pennies cannot fit in the bottle.\nPlease enter a another amount of pennies.");
	 		 amount = keyboard.nextInt();
	 	 }
		 else if (amount < 0 ){
			 System.out.println("Please enter a valid number");
		 amount = keyboard.nextInt(); 
		 pennies = amount;
		 }
		 
		 
	
	
return pennies; 

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
