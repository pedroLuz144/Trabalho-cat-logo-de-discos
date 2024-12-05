package com.example.CatalogoDeDiscos.dto;

import org.springframework.beans.BeanUtils;

import com.example.CatalogoDeDiscos.entity.ArtistasEntity;

public class ArtistasDTO {

    private Long id;
    private String nome;
    private String generoMusical;

    public ArtistasDTO() {
    }

    public ArtistasDTO(ArtistasEntity artista) {
        BeanUtils.copyProperties(artista, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

}
