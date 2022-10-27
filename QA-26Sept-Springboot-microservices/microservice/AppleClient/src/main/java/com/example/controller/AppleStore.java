package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Device;
import com.example.model.Devices;

@RestController
@RequestMapping("/apple")
public class AppleStore {
	@RequestMapping("/devices")
    public Devices getDevices()
    {
        List<Device> devices=new ArrayList<>();
        devices.add(new Device("Apple Iphone 14 promax","Just a smart phone with a good camera and very pricy"));
        devices.add(new Device("Iphone","Best phone money can buy"));        
        Devices list=new Devices("Apple",devices);
        return list;
    }
	
	
}
