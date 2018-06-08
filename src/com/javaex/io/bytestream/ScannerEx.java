package com.javaex.io.bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String filename = dirName + "thieves.txt";

	public static void main(String[] args) {
		File file=new File(filename);
		
		
		try {
			Scanner scanner=new Scanner(file);
			String name;
			float height;
			float weight;
			
			while(scanner.hasNextLine())
			{
				name=scanner.next();
				height=scanner.nextFloat();
				weight=scanner.nextFloat();
				
				
				System.out.printf("%s, 키: %f , 체중:%f\n",
						name,height,weight);
				scanner.nextLine();
				//남는게 있어서 해줌
			}
			scanner.close();
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
