package com.example.CatalogoDeDiscos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CatalogoDeDiscos.dto.ArtistasDTO;
import com.example.CatalogoDeDiscos.service.ArtistasService;

@RestController
@RequestMapping(value = "/artistas")
@CrossOrigin
public class ArtistasController {

    @Autowired
    private ArtistasService artistasService;

    @GetMapping
    public List<ArtistasDTO> listarTodos() {
        return artistasService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody ArtistasDTO artista) {
        artistasService.Inserir(artista);
    }

    @PutMapping
    public ArtistasDTO alterar(@RequestBody ArtistasDTO artista) {
        return artistasService.Alterar(artista);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        artistasService.Excluir(id);
        return ResponseEntity.ok().build();
    }
}
