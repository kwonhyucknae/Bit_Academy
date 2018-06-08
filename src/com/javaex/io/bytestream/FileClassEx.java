package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String dirName="D:\\javastudy\\files\\files";
	
public static void main(String[] args) {
	// 파일 객체 
	File root= new File(dirName);
	System.out.println(dirName + ":" + root.exists());
	
	printInfo(root);
	
	//디렉터리 안쪽에 파일 생성
	File file=new File(dirName+"\\myfile.txt");
	//물리적으로 만든 것은 아니고 객체만 만든 상태
	
	if(!file.exists())
	{//파일 없으면 생성
		try {
			file.createNewFile();			
		}catch(IOException e)
		{
			System.out.println("파일 못만듬");
			e.printStackTrace();
		}
	}
	printInfo(root);
	file.delete();
	//파일 삭제
	printInfo(root);
	
}
	

	static void printInfo(File F)
	{
		System.out.println("-----------------");
		//이 파일 객체가 디렉토리 인지 확인 
		if(F.isDirectory())
		{
			System.out.println("Directory:"+F.getName());
			File[] files =F.listFiles();
		//파일 리스트 출력
			for(File file:files)
			{
				System.out.print(file.isDirectory()?"d ":"f ");
				System.out.println(file.getName());

			}
		}else {//디렉토리 아님
			System.out.println("File:"+F.getName());
		}
		System.out.println("-----------------");
		
	}
	
	
	
}
