package com.javaex.io.bytestream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static String dirName="D:\\javastudy\\files\\files\\";
	static String filename=dirName+"thieves.txt";
	
	public static void main(String[] args) {
		// 스트림 열어봅시다
		
		try {
			Reader freader = new FileReader(filename);
			BufferedReader br=new BufferedReader(freader);
			
			String thief;
			
			while((thief=br.readLine())!=null)
			{//뒤 파라미터가 구분자
				StringTokenizer st=new StringTokenizer(thief," ");
				while(st.hasMoreTokens())
				{
					String token=st.nextToken();
					System.out.println(token+ " ");
				}
			System.out.println();
			}
		br.close();
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e)
		{
			System.out.println("IOException");
		}
		
	}
}
