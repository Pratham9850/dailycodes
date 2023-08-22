package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Item;
import com.service.ItemService;

@RestController
public class ItemController {
	
	
	@Autowired
	ItemService service;
	
	
	@GetMapping("/items")
	public ArrayList<Item> getItems()
	{
		return service.getItemList();
	}

	
	@PostMapping("/additem")
	public void addEmployee(@RequestBody Item i)
	{
		service.addItem(i);
	}
	
	@PatchMapping("/updateitem")
	public void updateEmployee(@RequestBody Item i)
	{
		service.updateItem(i);
	}
	
	@DeleteMapping("/deleteitem/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		service.deleteItem(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}