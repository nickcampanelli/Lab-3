package PkgException;

public class DeckException extends Exception{
	
	public DeckException(){
		System.out.println("No cards left in the deck");
	}

}