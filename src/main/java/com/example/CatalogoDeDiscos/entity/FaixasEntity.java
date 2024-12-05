package com.example.CatalogoDeDiscos.entity;

import org.springframework.beans.BeanUtils;

import com.example.CatalogoDeDiscos.dto.FaixasDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "faixas")
@Entity(name = "faixas")
public class FaixasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "disco_id")
    private DiscosEntity disco;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "artista_id")
    private ArtistasEntity artista;

    public FaixasEntity(FaixasDTO faixa) {
        BeanUtils.copyProperties(faixa, this);
    }

    public FaixasEntity() {
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
