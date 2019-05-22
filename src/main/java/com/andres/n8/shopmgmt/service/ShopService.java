package com.andres.n8.shopmgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andres.n8.shopmgmt.model.ShopDto;
import com.andres.n8.shopmgmt.repo.Shop;
import com.andres.n8.shopmgmt.repo.ShopRepository;

@Component
public class ShopService {
	
	@Autowired
	ShopRepository repository;
	
	public void add(ShopDto dto) {
		repository.save(toEntity(dto));
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
	
	public List<Shop> getShops(){
		return (List<Shop>) repository.findAll();
	}
	
	public Shop getShopById(long id) {
		Optional<Shop> optionalShop = repository.findById(id);
		return optionalShop.orElseThrow(() -> new EntityNotFoundException("shop",id+""));
	}

	private Shop toEntity(ShopDto dto) {
		Shop entity = new Shop();
		entity.setName(dto.getName());
		entity.setAddres(dto.getAddres());
		entity.setTelephone(dto.getTelephone());
		return entity;
	}
}
