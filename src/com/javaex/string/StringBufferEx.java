package com.javaex.string;

public class StringBufferEx {
public static void main(String[] args) {
	
	StringBuffer sb=new StringBuffer("This");
	sb.append(" is pencil");
	System.out.println(sb);
	sb.insert(7, " my");
	System.out.println(sb);
	sb.replace(7, 10, " your");
	System.out.println(sb);
	sb.setLength(5);
	System.out.println(sb);
	
}
}
