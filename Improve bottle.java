package bottle;
import java.util.Scanner; 
import java.util.prefs.*;
public class bottle {
private int pennies = 0; 
static final int MIN = 0;
 static final int  MAX = 500;
 Scanner keyboard;

 
 public bottle()
 {
     pennies = 0;

     keyboard = new Scanner(System.in);
 }

 public void read() {  
	 boolean stop = true; 
	 while(stop == true) {
		 stop = false;
		 pennies = keyboard.nextInt();
		 if(pennies >= MAX) {
			 stop = true;
			 System.out.println("Whoops that number cannot fit in the bottle.\nEnter another number for the bottle");
		 }
		 else if (pennies < MIN) {
			 stop = true;
			 System.out.println("You cannot put a negative number in the bottle silly.\nTry again");
		 }
     
	 }
 }

 public void set(int capacity)
 {
     pennies = capacity;
 }

 public void set(bottle bottle)
 {
     pennies = bottle.get();
 }

 public int get()
 {
     return pennies;
 }


 public bottle add(int value)
 {
     bottle bottle = new bottle();
     if (value + this.pennies >= MAX)
     {
    	 boolean enter = true; 
    	  System.out.println("Sorry! It has reached the max.");
    	  if( enter == true) {
    		  enter = false; 
    		  System.out.println("Please enter a smaller number than " + this.pennies);
    		  this.pennies= keyboard.nextInt(); 
    	  }
              }
     bottle.set(this.pennies + value);


     return bottle;
 }


 public bottle subtract(int value)
 {
     bottle bottle = new bottle();
     if (this.pennies - value <= MIN)
     {
    	  System.out.println("Sorry! It has reached the minimum.");
     }
     bottle.set(this.pennies - value);
     return bottle;
 }


 public bottle multiply(int value)
 {
     bottle bottle = new bottle();
     if (this.pennies * value >= MAX){
    	 System.out.println("Sorry! It has reached the bounds.");
         bottle.set(this.pennies * value);
     }
    
     bottle.set(this.pennies * value);
 
     return this;
 }


 public bottle divide(int value)
 {
     bottle bottle = new bottle();

     if (this.pennies > 0 && value > 0)
     {
         bottle.set(this.pennies / value);
     }
     else
     {
         System.out.println("Sorry! It has reached the bounds.");
     }

     return bottle;
 }


 public bottle add(bottle bottle)
 {
     bottle bot = new bottle();
     if (bottle.get() + this.pennies <= MAX)
     {

         bot.set(this.pennies + bottle.get());
     }
     else
     {
         System.out.println("Sorry! It has reached the max.");
         
     }

     return bot;
 }


 public bottle subtract(bottle bottle)
 {
     bottle bot = new bottle();
     if (bottle.get() - this.pennies >= MIN)
     {

         bot.set(bottle.get() - this.pennies);
     }
     else
     {
         System.out.println("Sorry! It has reached the min.");
     }

     return bot;
 }


 public bottle multiply(bottle bottle)
 {
     bottle bot = new bottle();
     if ( this.pennies * bottle.get() >=  MAX)
     {

         System.out.println("Whoops thats out of bounce");
        if(this.pennies > bottle.get()) {
        	this.pennies = keyboard.nextInt(); 
        }
        else if( bottle.get()> this.pennies) {
        	int x; 
        	x = keyboard.nextInt(); 
        	
        }
     }
     bot.set(this.pennies * bottle.get());
 

     // return the current Bottle object
     return bot;
 }


 public bottle divide(bottle bottle)
 {
     bottle bot = new bottle();

     if (this.pennies > 0 && bottle.get() > 0)
     {
         bot.set(this.pennies / bottle.get());
     }
     else
     {
         System.out.println("Sorry! It has reached the bounds.");
     }

     return bot;
 }


 public boolean equals(bottle bottle)
 {

     if (this.pennies == bottle.get())
         return true;

     return false;
 }


 public String toString()
 {
     return String.valueOf(this.pennies);
 }
/*
public  void  read(){
	
	
	 boolean stop = true; 
	 int getInput = 0; 
	 while (stop == true) {	
		 stop = false; 
		 getInput = keyboard.nextInt();
		
		
		 if(getInput>= MAX ) {
					stop= true;
			 System.out.println("Please Enter a smalller number. ");
		 }
		 else if (getInput < MIN) {
			 stop = true; 
			 System.out.println("You can not put a negative number in the bottle.\nplease enter another number ");
		 }			  
	 }//while ;  
	 pennies = getInput; 
	 System.out.println("The amount pennies is " + pennies); 
 }//End read
public bottle(int pennies) {
	this.pennies = pennies;
}
public String toSting() {
	return "" + this.pennies;}
public void set(int pennies) {
	
}
 public int getPennies() {
	 int x = pennies; 
	 pennies = x; 
	 return pennies; 
	 
 }	
 public bottle add(bottle bottle) {
	 
	bottle bottle2 = new bottle(0); 
	bottle bottle3 = new bottle(0); 
	bottle bottle4 = new bottle(0); 
	 
	bottle2.getPennies();  
	bottle3.getPennies(); 
	
	System.out.println(bottle3);
	System.out.println(bottle2);
//	bottle2 = ge
	return bottle2;
 }
 
 /*c
 public  int add(int bottle12) {
	 bottle12 = pennies;
	 pennies = pennies + bottle12; 
	 System.out.println(pennies);
	 
	 return pennies; 
 }//end add

public bottle add() {
	int bottle1; 
	bottle bottle2 = new bottle(); 
	bottle bottle3 = new bottle(); 
	bottle bottle4 = new bottle(); 
	int x = pennies;
	int y = pennies; 
	System.out.println(y + x);
	bottle = y + x;
	return bottle; 
}
*//*
public int getFirstNumber() {
	//System.out.println(numberOne);
	
	return  this.pennies;
}//end getFirstNumber
public static int getSecondNumber(int numberTwo) {

	//System.out.println("Two" + numberTwo);
	return numberTwo; 
}//end getSecondNumber
/* public static  int add(int bottle1, int bottle2,  ) {
	 
	bottle1 = getSecondNumber();
	bottle1 = bottle1 + this.pennies;
	//System.out.println(bottle3);
	return bottle3; 

}//end add */ /*
public int subtract( ) {
	int bottle2 =0 ; 
	System.out.println(this.pennies);
	int t = this.pennies;
	int r= pennies;
	System.out.println("this is t " + t); 
	System.out.println("this is r" + r);
	
	if(r > t) {
		
		bottle2 = r - t;
		System.out.println("Subtract " + pennies + " from "+ this.pennies + "\nWill equals " 
		+ bottle2+ ".");
		bottle2 = pennies;
	}/*
	else if(this.pennies> pennies) {
		bottle1 = pennies - this.pennies;
		System.out.println("Subtract " + this.pennies+ " from "+ pennies + "\nWill equals " 
				+ bottle1 + ".");
	}
	else {
		bottle1 = pennies - this.pennies;
		System.out.println("Because " + pennies + " and " + this.pennies +
				" are equals it will be 0");

	}*//*
	System.out.println(bottle2);
	return pennies;
}//end Subtract
/*
public static int divide(int bottle1, int bottle2, int bottle3, int bottle4 ) {
	
	bottle1 = getFirstNumber(bottle1);
	bottle2 = getSecondNumber(bottle2);
	bottle3 = bottle1 + bottle2; 
	bottle4 = bottle3 / 2; 
	
	return bottle4; 
}//End divide 
public int multiply(int bottle1, int bottle2 ) {
	return bottle2;
	

}
*/


/*public bottle subtract(bottle bottle1) {
	bottle1 = pennies;
	
	return null;
} 
*/
}//End class
