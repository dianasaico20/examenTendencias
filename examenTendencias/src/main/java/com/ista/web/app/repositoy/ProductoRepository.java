package com.ista.web.app.repositoy;

import org.springframework.data.repository.CrudRepository;

import com.ista.web.app.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer>{

}
