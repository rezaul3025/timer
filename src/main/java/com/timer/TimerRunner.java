package com.timer;

public class TimerRunner
{
	public static void main(String[] arg)
	{
		//System.out.println("Hello");
		Timer timer = new Timer(0,0,0);
		
		timer.setTime(23, 54, 55);
		timer.show12Hour();
	}
}
