package bottle;

import java.lang.reflect.Method;

import junit.framework.Test;

public class bottleDemo {

	public static void main(String[] args) throws ReflectiveOperationException  {
	
	//bottle bottle2 = new bottle(); 

	
	/* 
	Class<?> c = Class.forName("bottle.bottle");
	Test t = (Test)c.newInstance();
	Method m = c.getDeclaredMethod("pennies"+ null);
	m = setAccessible(true);
	m.invoke(t);
	*/ 
	System.out.println("Enter a number for the bottle ");
	int bottle1 = bottleSecond.read(); 
	//System.out.println(bottle1 +  ""+ bottle1);
	bottle1 = bottleSecond.getFirstNumber(bottle1); 
	System.out.println("Enter another number for the bottle ");
	int bottle2= bottleSecond.read(); 
	System.out.println(bottle1);
	bottle2 = bottleSecond.getSecondNumber(bottle2); 
	System.out.println(bottle2);
	int bottle3 = 0; 
	 bottle3 = bottleSecond.add(bottle1, bottle2, bottle3  );
	System.out.println(bottle3);
	if(bottle3 > bottle.MAX) {
		if(bottle1 > bottle2) {
			System.out.println("Enter a number for the bottle ");
			bottle1 = bottle.read(); 
			bottle1 = bottle.getFirstNumber(bottle1);
			bottle3 = bottle.add(bottle1, bottle2, bottle3  );
		}
		else {
			System.out.println("Enter a number for the bottle ");
			bottle2 = bottle.read(); 
			bottle2 = bottle.getSecondNumber(bottle2); 
			bottle3 = bottle.add(bottle1, bottle2, bottle3  );
		}
	}//end IF 
	bottle3 = bottle.subtract(bottle1,bottle2, bottle3); 
	int bottle4 = 0 ; 
	bottle4 = bottle.divide(bottle1, bottle2, bottle3, bottle4);
	System.out.println(bottle4);
	
	
	
//	int bottle1 = bottle.add(); 

	//System.out.println(bottle1); 
	
	
	



	}

	/*private static Method setAccessible(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	*/ 

}
