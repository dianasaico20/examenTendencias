package com.ista.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.web.app.entity.Producto;

import com.ista.web.app.repositoy.*;

@Service
public class ProductoServicelmpl  implements IProductoService {
	@Autowired
	private ProductoRepository ProductoRepository;
	

	@Override
	@Transactional (readOnly =true)
	public List<Producto> findAll() {
		return (List<Producto>)ProductoRepository.findAll();
	}

	@Override
	public Producto save(Producto cliente) {
		return ProductoRepository.save(cliente);
	}

	@Override
	public Producto findById(Integer id) {
		return ProductoRepository.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		ProductoRepository.deleteById(id);		
	}
}
