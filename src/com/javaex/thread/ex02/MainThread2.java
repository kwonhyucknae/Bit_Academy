package com.javaex.thread.ex02;

public class MainThread2 {

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
		
		//thread 와 thread2를 메인 스레드의 합류
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인쓰레드 종료");
		
		
	}
}
