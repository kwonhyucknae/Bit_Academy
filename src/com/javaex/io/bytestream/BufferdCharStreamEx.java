package com.javaex.io.bytestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferdCharStreamEx {
	
	static String dirName="D:\\javastudy\\files\\files\\";
	static String source =dirName+"last-leaf.txt";
	static String target=dirName+"last_leaf-filtered.txt";
	
	public static void main(String[] args) {
		try {
			Reader fr=new FileReader(source);
			Writer fw=new FileWriter(target);
			
			//보조 스트림을 열겟다.
			
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter bw=new BufferedWriter(fw);
			
			//line을 가지고 필터를 해보자 
			String line="";
			while((line=br.readLine())!=null)
			{
				if(line.toLowerCase().contains("leaf")|| 
				   line.toLowerCase().contains("leabes"))
				{//leaf,leaves 들어있는 라인만 출력
					
					bw.write(line);
					bw.write("\r\n");
				}
				
			}
			
			
			br.close();
			bw.close();
			//보조 스트림 닫으면 주 스트림 닫힘
			System.out.println("필터링 완료!");
			
			
		}catch(FileNotFoundException e)
		{
			System.out.println("파일 못찾는다 ㅅㅂ");
		}catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
}
