package com.gl.javafsd.ds4.brackets;

public class Brackets {
	
	private Character openBracket;
	private Character closeBracket;
	
	public Brackets (Character openBracket, Character closeBracket) {
		this.openBracket = openBracket;
		this.closeBracket= closeBracket;		
	}

	public Character getOpenBracket() {
		return openBracket;
	}

	public void setOpenBracket(Character openBracket) {
		this.openBracket = openBracket;
	}

	public Character getCloseBracket() {
		return closeBracket;
	}

	public void setCloseBracket(Character closeBracket) {
		this.closeBracket = closeBracket;
	}
	
}