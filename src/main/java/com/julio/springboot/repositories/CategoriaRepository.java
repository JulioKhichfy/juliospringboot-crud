package com.julio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julio.springboot.domain.Categoria;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
