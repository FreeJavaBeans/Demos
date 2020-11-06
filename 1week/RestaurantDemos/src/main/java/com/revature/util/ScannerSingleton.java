package com.revature.util;

import java.util.Scanner;

public class ScannerSingleton {

	private static Scanner scan = new Scanner(System.in);
	
	public static Scanner getScanner() {
		return scan;
	}
	
}
