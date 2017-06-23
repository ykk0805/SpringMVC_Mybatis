package com.ykk;

import java.util.Timer;

public class TimerTest {
	
	Timer timer ;
	
	public TimerTest (int time) {
		timer = new Timer();
		timer.schedule(new TimerTaskTest(), time*1000);
	}
	
	public static void main(String[] args) {
		System.out.println("time begin....");
		new TimerTest(3);
	}
}
