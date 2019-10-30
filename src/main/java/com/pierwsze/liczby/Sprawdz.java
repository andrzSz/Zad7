package com.pierwsze.liczby;

public class Sprawdz {

	public String Go(String y1, String y2) {
	
		int x1 = 0, x2 =0;
		boolean go = true;
		
		if (y1 == null) {
			go = false;
		}
		try { x1 = Integer.parseInt(y1); }
		catch (NumberFormatException ex) {
			go = false;
			System.out.println(y1 + " nie jest liczba calkowita");
		}
		
		if (y2 == null) {
			go = false;
		}
		try { x2 = Integer.parseInt(y2); }
		catch (NumberFormatException ex) {
			go = false;
			System.out.println(y2 + " nie jest liczba calkowita");
		}
		
		if (go) {
			Znajdz znajdz = new Znajdz();
			return znajdz.szukaj(x1,x2);
		}
		else {
			System.out.println("wystąpił błąd");
			return "";
		}
	}
}
