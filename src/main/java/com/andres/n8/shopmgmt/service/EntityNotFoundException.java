package com.andres.n8.shopmgmt.service;

public class EntityNotFoundException extends RuntimeException {

	public EntityNotFoundException(String object,String id) {
		super("Couldn't find a "+object+" with the provided id: "+id);
	}
}
