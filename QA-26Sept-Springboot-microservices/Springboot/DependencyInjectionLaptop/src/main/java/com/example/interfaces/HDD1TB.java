package com.example.interfaces;

import org.springframework.stereotype.Component;

import com.example.Storage.storage;

@Component("1TB")
public class HDD1TB implements storage{
	public String spec() {
	return "1TB";
}
}
