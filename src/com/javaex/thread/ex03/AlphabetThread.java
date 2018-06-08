package com.javaex.thread.ex03;

public class AlphabetThread implements Runnable{

	@Override
	public void run() {
		
		
		// TODO Auto-generated method stub
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
			try {
				Thread.sleep(300);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		//super.run();
	}
}
