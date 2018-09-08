package bottle;
import java.util.Scanner; 

public class bottle {
public int amountPennies;  
private int pennies; 
Scanner keyboard = new Scanner(System.in);
static final int MIN = 0;
 static void MAX() {
	 int MAX = 500; 
	 return; 
 }
 private int inPut() {
	 int amount = 0; 
	 System.out.println("Enter a number for the bottle");
	 amount = keyboard.nextInt(); 	
	while(amount < 0 ){
		System.out.println("Please enter a valid number");
		 amount = keyboard.nextInt(); 
		 amountPennies = amount;
	 	 
	}
	return amountPennies;

 }
 public void Bottle(){
	 
 }
 //public String NewBottle() {
	// return bottle;
 //}

}//End class
