package com.andres.n8.shopmgmt.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andres.n8.shopmgmt.model.ShopDto;
import com.andres.n8.shopmgmt.repo.Shop;
import com.andres.n8.shopmgmt.service.ShopService;

@RestController
@RequestMapping("shops")
public class ShopController {
	
	@Autowired
	ShopService service;
	
	@GetMapping
	public List<Shop> getShop(){
		return service.getShops();
	}
	
	@PostMapping
	public void createShop(@RequestBody ShopDto dto) {
		service.add(dto);
	}
	
	@GetMapping("/{id}")
	public Shop getById(@PathVariable(required=true) long id) {
		return service.getShopById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteShop(@PathVariable(required=true) long id) {
		service.delete(id);
	}
}
