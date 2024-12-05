package com.example.CatalogoDeDiscos.entity;

import org.springframework.beans.BeanUtils;

import com.example.CatalogoDeDiscos.dto.DiscosDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "discos")
@Entity(name = "discos")
public class DiscosEntity {

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(name = "anodelancamento")
    private Integer anoDeLancamento;

    public DiscosEntity(DiscosDTO disco) {
        BeanUtils.copyProperties(disco, this);
    }

    public DiscosEntity() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(Integer anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    

}
