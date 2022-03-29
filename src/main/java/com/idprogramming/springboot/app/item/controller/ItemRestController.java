package com.idprogramming.springboot.app.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idprogramming.springboot.app.item.models.Item;
import com.idprogramming.springboot.app.item.service.ItemService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"*"})
public class ItemRestController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/items")
    public List<Item> findAll(){
        return itemService.findAll();
    }
	
	@GetMapping("/items/{id}/cantidad/{cantidad}")
    public Item findById(@PathVariable Long id, @PathVariable Integer cantidad){
        return itemService.findById(id,cantidad);
    }
	
	

}
