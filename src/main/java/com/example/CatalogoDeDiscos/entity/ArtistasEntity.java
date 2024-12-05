package com.example.CatalogoDeDiscos.entity;

import org.springframework.beans.BeanUtils;

import com.example.CatalogoDeDiscos.dto.ArtistasDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "artistas")
@Entity(name = "artistas")
public class ArtistasEntity {

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "generomusical")
    private String generoMusical;

    public ArtistasEntity(ArtistasDTO artista) {
        BeanUtils.copyProperties(artista, this);
    }

    public ArtistasEntity() {

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
