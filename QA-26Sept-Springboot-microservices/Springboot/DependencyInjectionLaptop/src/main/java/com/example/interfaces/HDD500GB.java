package com.example.interfaces;

import org.springframework.stereotype.Component;

import com.example.Storage.storage;

@Component("500GB")
public class HDD500GB implements storage{
	public String spec() {
	return "1TB";
}
}
