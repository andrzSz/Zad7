package com.pierwsze.liczby;

public class Znajdz {

	public String szukaj(int x1, int x2) {
		
		String arr = "";
		for (int i = x1 ; i <= x2; i++)
        {
            for (int j = 1; j < i; j++)
            {
            	if ((i % j == 0) && (j != 1)) break;   
            	if (j == (i - 1)) arr = arr + i + " ";  
            }
        }
		System.out.println(arr);
		return arr;
	}
}
