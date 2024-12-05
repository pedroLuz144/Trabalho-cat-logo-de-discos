package com.example.CatalogoDeDiscos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CatalogoDeDiscos.dto.ArtistasDTO;
import com.example.CatalogoDeDiscos.entity.ArtistasEntity;
import com.example.CatalogoDeDiscos.repository.ArtistasRepository;

@Service
public class ArtistasService {

    @Autowired
    private ArtistasRepository artistasRepository;

    public List<ArtistasDTO> listarTodos() {
        List<ArtistasEntity> artistas = artistasRepository.findAll();
        return artistas.stream().map(ArtistasDTO::new).toList();
    }

    public void Inserir(ArtistasDTO artista) {
        ArtistasEntity artistasEntity = new ArtistasEntity(artista);
        artistasRepository.save(artistasEntity);
    } 

    public ArtistasDTO Alterar(ArtistasDTO artista) {
        ArtistasEntity artistasEntity = new ArtistasEntity(artista);
        return new ArtistasDTO(artistasRepository.save(artistasEntity));
    }

    public void Excluir (Long id) {
        ArtistasEntity artista = artistasRepository.findById(id).get();
        artistasRepository.delete(artista);
    }

}
