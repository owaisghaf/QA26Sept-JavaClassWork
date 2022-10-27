package com.example.engines;

import org.springframework.stereotype.Component;

import com.example.interfaces.Engine;

@Component("V8")
public class v8 implements Engine{
	public String spec()
	{
		return "V8";
	}

}
