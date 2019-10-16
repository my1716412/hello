package com.yedam.lambda;

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("a =>" + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		};
		Thread thread = new Thread(runnable); // run method
		thread.start();
		
		Thread thread2= new Thread(() -> {
			for(int i=0; i<5; i++) {
				System.out.println("b =>" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread2.start();
	}
}
