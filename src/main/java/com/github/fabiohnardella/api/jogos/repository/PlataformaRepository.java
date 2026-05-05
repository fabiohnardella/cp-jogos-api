package com.github.fabiohnardella.api.jogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.fabiohnardella.api.jogos.models.Plataforma;

@Repository
public interface PlataformaRepository extends JpaRepository<Plataforma, Long>{

    
}