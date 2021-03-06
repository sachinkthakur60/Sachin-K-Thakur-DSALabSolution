package com.gl.javafsd.ds4.brackets;

public class BracketsTest {
	
	public static void main(String [] args) {
		test("([[{}]])");
		
		test("([[{}]]))");

		
	}
	
	private static void test(String brackets) {
		BalancedBracketsChecker checker = new BalancedBracketsChecker(brackets);
		boolean result = checker.check();
		
		if (result) {
			System.out.println("Bracket expression '" + brackets+ " is balanced");
		}else {
			System.out.println("Bracket expression "+brackets+" is Not balanced");
		}
	}
}
