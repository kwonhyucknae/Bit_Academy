package com.javaex.api;

public class RectangleApp {
public static void main(String[] args) {
	
	Rectangle a= new Rectangle(6,4);
	Rectangle b= new Rectangle(6,4);
	Rectangle c= new Rectangle(6,4);
	Rectangle d=c;
	
	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
	System.out.println(a.equals(d));
	System.out.println(d.equals(c));

}
}
