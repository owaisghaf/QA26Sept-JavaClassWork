package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Device;
import com.example.model.Devices;

@RestController
@RequestMapping("/samsung")
public class SamsungStore {
	@RequestMapping("/devices")
    public Devices getDevices()
    {
        List<Device> devices=new ArrayList<>();
        devices.add(new Device("Samsung Galaxy S10","Just a smart phone with a good camera and very pricy"));
        devices.add(new Device("Galaxy","Best device to take pictures"));        
        Devices list=new Devices("Samsung",devices);
        return list;
    }
	
	
}
