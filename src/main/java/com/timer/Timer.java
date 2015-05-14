package com.timer;

import java.util.HashMap;
import java.util.Map;

public class Timer
{
	private int hh;
	private int mm;
	private int ss;
	
	public Timer(int hh, int mm, int ss)
	{
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	
	void setTime(int hh, int mm, int ss)
	{
		
		
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	void show12Hour()
	{
		Map<Integer,Integer> timeMapper = new HashMap<Integer,Integer>();
		int hh12 = 12;
		int temphh12Counter=12;
		for(int i=23;i>12;i--)
		{
			temphh12Counter--;
			timeMapper.put(i, temphh12Counter);
		}
		
		if(hh<24 && hh>12)
		{
			hh12 = timeMapper.get(hh);
		}
		
		boolean isInValidTime = (hh>23 || hh<0) ||  (mm>59 || mm<0) || (ss>59 || ss<0)?true:false;
		
		
		if(isInValidTime)
		{
			hh12=12;
			mm=0;
			ss=0;
		}
		
		System.out.println("Time display in 12 hours format: "+hh12+":"+mm+":"+ss);
	}
	void show24Hour()
	{
		
	}

}
