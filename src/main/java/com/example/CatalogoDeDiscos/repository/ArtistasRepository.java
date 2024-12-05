package com.example.CatalogoDeDiscos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CatalogoDeDiscos.entity.ArtistasEntity;

public interface ArtistasRepository extends JpaRepository<ArtistasEntity, Long>{

}
