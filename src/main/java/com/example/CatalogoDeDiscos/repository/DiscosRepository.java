package com.example.CatalogoDeDiscos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CatalogoDeDiscos.entity.DiscosEntity;

public interface DiscosRepository extends JpaRepository <DiscosEntity, Long>{

}
