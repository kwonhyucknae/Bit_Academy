package com.javaex.thread.ex01;

public class DigitThread extends Thread{

	
	@Override
	public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<30;i++)
	{
		System.out.println("DigitThread:"+i);
		try {
			Thread.sleep(300);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	super.run();
	
	}
}
