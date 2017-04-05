package PkgException;

import pkgPokerBLL.Hand;

public class exHand extends Exception {
	
	public exHand() {
		System.out.println("Top two hands are tied");
	}

}