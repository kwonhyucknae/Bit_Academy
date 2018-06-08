package com.javaex.api;

public class Rectangle {

	int width,height;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int a,int b) {
		width=a;
		height=b;
		
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean equals(Rectangle a)
	{
		if(this.width*this.height==a.width*a.height)
		{
			return true;
		}
		return false;
	}
}
