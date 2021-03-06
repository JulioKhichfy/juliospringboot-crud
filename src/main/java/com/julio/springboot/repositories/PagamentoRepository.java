package com.julio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julio.springboot.domain.Pagamento;



@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
