package com.example.CatalogoDeDiscos.dto;

import org.springframework.beans.BeanUtils;

import com.example.CatalogoDeDiscos.entity.DiscosEntity;

public class DiscosDTO {

    private Long id;
    private String titulo;
    private Integer anoDeLancamento;
    
    public DiscosDTO() {
    }

    public DiscosDTO(DiscosEntity disco) {
        BeanUtils.copyProperties(disco, this);
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
