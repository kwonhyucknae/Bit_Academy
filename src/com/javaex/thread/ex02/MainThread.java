package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		//메인 쓰레드의 코드를 만들겠습니다.
		
		Thread thread=new DigitThread();
		//쓰레드의 시작
		thread.start();
		
		
		
		
		// AlphabetThread로 이동 

//		for(char ch='A';ch<='Z';ch++)
//		{
//			System.out.println(ch);
//			try {
//				Thread.sleep(1000);
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		

		Thread thread2 = new AlphabetThread();
		thread2.start();
		
		System.out.println("메인쓰레드 종료");
		
	}
}
