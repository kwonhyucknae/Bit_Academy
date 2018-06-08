package com.javaex.io.bytestream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static String dirName="D:\\javastudy\\files\\files\\";
	static String filename="char.txt";
	
	public static void main(String[] args) {
		
		try {
			Writer fwriter=new FileWriter(dirName+filename);
			fwriter.write("Bit Computer\r\n");
			fwriter.write("Java Programming\r\n");
			fwriter.write("2018.05");
			fwriter.close();		
			
			
			Reader freader= new FileReader(dirName+filename);
			
			int data=0;
			while((data=freader.read())!=-1)
			{
				System.out.println((char)data);
			}
			
		}catch(FileNotFoundException e)
		{
			System.out.println("파일을 찾을 수 없어요");
		}catch(IOException e)
		{
			System.out.println("IOException");
		}
	
	}

}
