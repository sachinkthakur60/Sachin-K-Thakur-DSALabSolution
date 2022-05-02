package com.gl.javafsd.ds4.brackets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketsManager {
	
	private static Set<Brackets> predefinedBrackets;
	
	public BracketsManager() {
		
	}
	
	
	static {
		predefinedBrackets = new LinkedHashSet<Brackets>();
		
		predefinedBrackets.add(new Brackets('(',')'));
		
		predefinedBrackets.add(new Brackets('[',']'));
		
		predefinedBrackets.add(new Brackets('{','}'));
		
		predefinedBrackets.add(new Brackets('<','>'));
				
	}
	public static Set<Character> getOpenBrackets(){
		Set<Character> result = new LinkedHashSet<Character>();
		Iterator<Brackets> iterator = predefinedBrackets.iterator();
		
		while (iterator.hasNext()) {
			Brackets bracket = iterator.next();
			result.add (bracket.getOpenBracket());
		}
		return result;
	}
	
	public static Set<Character> getCloseBrackets(){
		Set<Character> result = new LinkedHashSet<Character>();
		Iterator<Brackets> iterator = predefinedBrackets.iterator();
		
		while (iterator.hasNext()) {
			Brackets bracket = iterator.next();
			result.add(bracket.getCloseBracket());
		}
		return result;
	}
	
	public static Brackets getBracket(Character closeBracket) {
		for (Brackets predefinedBracket : predefinedBrackets) {
			if (predefinedBracket.getCloseBracket().equals(closeBracket)) {
				return predefinedBracket;
			}
		}
		return null;
	}
}

