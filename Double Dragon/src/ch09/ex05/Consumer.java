package ch09.ex05;

public class Consumer implements Runnable {
	private String name;
	private Buffer buffer;
	
	public Consumer(String name, Buffer buffer) {
		this.name = name;
		this.buffer = buffer;
	}

	@Override
	public void run() {
		int data = buffer.get();
		System.out.println(name +": " + data + " archeived");
		try {
			Thread.sleep((int)(Math.random()*100));
		}catch(InterruptedException e) {}
		}
	}