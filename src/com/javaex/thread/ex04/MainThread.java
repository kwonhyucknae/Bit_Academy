package com.javaex.thread.ex04;

public class MainThread {

	public static void main(String[] args) {
		//메인 쓰레드의 코드를 만들겠습니다.
		
		Thread thread=new Thread(new DigitThread());
		Thread thread2=new Thread(new AlphabetThread());
		
		//쓰레드의 우선순위 줌
		thread.setPriority(Thread.MAX_PRIORITY);//10
		thread2.setPriority(Thread.MIN_PRIORITY);//1
		
		//쓰레드의 시작
		thread.start();
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
