package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferdStreamEx {
	static String dirName="D:\\javastudy\\files\\files\\";
	static String source=dirName + "img.jpg";
	static String target=dirName+"img_bufferd.copy.jpg";
	
	public static void main(String[] args) {
		//File 스트림을 열어 보자
		try
		{
			InputStream fis=new FileInputStream(source);
			OutputStream fos=new FileOutputStream(target);
			
			//전송 효율을 올리기 위해 버퍼스트림
			BufferedInputStream bis=new BufferedInputStream(fis);
			//파라미터에 메인 스트림 넣음
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			
			//int data=0; 과 비교 
			byte[] data=new byte[1024];
		
			int size=0;
			
			while((size=bis.read(data)) != -1)
			{
					bos.write(data);
					System.out.println(size+"바이트 복사함");
					
			}
			
			bis.close();
			bos.close();
			System.out.println("파일 복사 완료함");
			
		}catch(FileNotFoundException e)
		{
			System.out.println("파일 못찾음");
		}catch(IOException e)
		{
			System.out.println("IOException");
		}
		
	}
}
