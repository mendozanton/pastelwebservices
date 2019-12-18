package com.api.pastelwebservices.util;

public class Generar {
	
	public static String Codigo() {
		final String NUMEROS = "0123456789";
		final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
		final String ESPECIALES = "ñÑ";
		final int length = 15;
		final String key = NUMEROS + MAYUSCULAS;
		String clv = "";
		 
		for (int i = 0; i < length; i++) {
			clv += (key.charAt((int)(Math.random() * key.length())));
		}
 
		return clv;
	}
}
