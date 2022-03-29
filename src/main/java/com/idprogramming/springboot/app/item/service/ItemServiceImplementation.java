package com.idprogramming.springboot.app.item.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.idprogramming.springboot.app.item.models.Item;
import com.idprogramming.springboot.app.item.models.Producto;

@Service
public class ItemServiceImplementation implements ItemService {
	
	@Autowired
	private RestTemplate clientRest;

	@Override
	public List<Item> findAll() {
		List<Producto> productos = Arrays.asList(clientRest.getForObject("http://localhost:8001/api/productos", Producto[].class));
		return productos.stream().map(p -> new Item (p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Producto producto = clientRest.getForObject("http://localhost:8001/api/productos/{id}", Producto.class, pathVariables);
		return new Item(producto, cantidad);
	}

}
