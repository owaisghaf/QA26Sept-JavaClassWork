package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Account;
import com.example.service.AccountService;
import com.example.service.MainService;

@RestController // responsible for routing user request to expose data
public class MainController {// simple java class
	
	@Autowired
	AccountService accService;
	
	//GET method
		@GetMapping("/acclist")
		public List<Account> accShowList()
		{
			return this.accService.show();
		}
		//POST add to the list
		@PostMapping("/accAdd")
		public List<Account> accAddToList()
		{
			return this.accService.create();
		}
		//PUT update the list
		@PutMapping("/accUpdate/{id}")// http://localhost:8080/update/4
		public void accUpdateTheList(@PathVariable int id)
		{
			this.accService.update(id);
			
		}
		//DELETE deletes a record
		@DeleteMapping("/accDelete/{id}")
		public void accDeleteFromTheList(@PathVariable int id)
		{
			this.accService.delete(id);
			
		}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Autowired
	MainService service;
	////-----------for String controller----//////
	//GET method
	@GetMapping("/list")
	public List<String> showList()
	{
		return this.service.show();
	}
	//POST add to the list
	@PostMapping("/add")
	public List<String> addToList()
	{
		return this.service.create();
	}
	//PUT update the list
	@PutMapping("/update/{id}")// http://localhost:8080/update/4
	public void updateTheList(@PathVariable int id)
	{
		this.service.update(id);
		
	}
	//DELETE deletes a record
	@DeleteMapping("/delete/{id}")
	public void deleteFromTheList(@PathVariable int id)
	{
		this.service.delete(id);
		
	}	

}
