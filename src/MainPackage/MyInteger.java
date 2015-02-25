package MainPackage;

public class MyInteger {
	int Value;
	
	public MyInteger(int Value){
		this.Value=Value;
	}
	public int getValue(){
		return Value;
	}
	public boolean isEven(){
		
		if(Value%2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isOdd(){
		
		if (Value % 2 != 0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isPrime(){
		 
		for (int I = 2; I < Value; I++){
			if (Value % I == 0 && I != Value){
				return true;
	
			}
					
	    }
		return false;
	}
		
	public static boolean isEven(int Value){
		if (Value % 2 == 0){
			return true;
			
		}
		return false;
		
	}
	
	public static boolean isOdd(int Value){
		if (Value % 2 != 0){
			return true;
		}
		return false;
	}
		
	public static boolean isPrime(int Value){
		for (int I = 2; I < Value; I++){
			if (Value % I == 0 && I != Value){
				return true;
	
			}
					
	    }
		return false;
		
	}
	
	public static boolean isEven(MyInteger EVENINT){
		return EVENINT.isEven(EVENINT.getValue());
	}
	
	public static boolean isOdd(MyInteger ODDINT){
		return ODDINT.isOdd(ODDINT.getValue());
	}
	public static boolean isPrime(MyInteger PRIMEINT){
		return PRIMEINT.isPrime(PRIMEINT.getValue());
	}
	
	public boolean Equals(int NewValue){
		if (Value == NewValue){
			return true;
		}
		return false;
	}
	
	public boolean Equals(MyInteger NewValue){
		if (NewValue.getValue() == Value){
			return true;
		}
		return false;
	}

	
	/*public static int ParseInt(char[]){
		char Array = new Array(1,2,3,4,5);
		
	}*/
	
}

