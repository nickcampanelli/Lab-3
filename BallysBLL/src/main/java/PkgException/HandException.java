package PkgException;

public class HandException extends Exception{
	
	public HandException(){
		
	}
	
	public HandException(int numCards){
		System.out.println("Less than 5 cards in hand");
	}

}