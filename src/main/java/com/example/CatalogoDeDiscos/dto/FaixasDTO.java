package com.example.CatalogoDeDiscos.dto;

import com.example.CatalogoDeDiscos.entity.DiscosEntity;
import com.example.CatalogoDeDiscos.entity.FaixasEntity;
import com.example.CatalogoDeDiscos.entity.ArtistasEntity;

public class FaixasDTO {

    private Long id;
    private String titulo;
    private DiscosEntity disco;  
    private ArtistasEntity artista; 

    public FaixasDTO() {
    }

    public FaixasDTO(FaixasEntity faixa) {
        this.id = faixa.getId();
        this.titulo = faixa.getTitulo();
        this.disco = faixa.getDisco(); 
        this.artista = faixa.getArtista(); 
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

    public DiscosEntity getDisco() {
        return disco;
    }

    public void setDisco(DiscosEntity disco) {
        this.disco = disco;
    }

    public ArtistasEntity getArtista() {
        return artista;
    }

    public void setArtista(ArtistasEntity artista) {
        this.artista = artista;
    }
}
