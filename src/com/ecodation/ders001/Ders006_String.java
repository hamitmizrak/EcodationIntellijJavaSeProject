package com.ecodation.ders001;

import javax.swing.JOptionPane;

public class Ders006_String {
	public static void main(String[] args) {

		// String kelime = "Java JavaScript Jsp Servlet JSF spring ";
		String kelime = JOptionPane.showInputDialog("lütfen bir şeyler giriniz");
		System.out.println(kelime.length());
		System.out.println(kelime.toUpperCase());
		System.out.println(kelime.toLowerCase());
		System.out.println(kelime.trim().length());
		System.out.println(kelime.indexOf("s"));
		System.out.println(kelime.lastIndexOf("s"));
		System.out.println(kelime.charAt(2));
		System.out.println(kelime.substring(2));
		System.out.println(kelime.substring(0, 6)); // 0<=x<=6-1
		System.out.println(kelime.concat(" Muhammet").concat(" Uğur"));
		System.out.println(kelime.startsWith("J"));
		System.out.println(kelime.endsWith("a"));
		System.out.println(kelime.contains("Jsp"));
		System.out.println(kelime.replace(kelime, "yeni kelime"));
		System.out.println(kelime.isEmpty());
		System.out.println("kimlik numarası: " + kelime.hashCode());
		System.out.println(kelime.equals("Java JavaScript Jsp Servlet JSF spring "));

	}
}
