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

import com.example.CatalogoDeDiscos.dto.DiscosDTO;
import com.example.CatalogoDeDiscos.service.DiscosService;

@RestController
@RequestMapping(value = "/discos")
@CrossOrigin
public class DiscosController {

    @Autowired
    private DiscosService discosService;

    @GetMapping
    public List<DiscosDTO> listarTodos() {
        return discosService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody DiscosDTO disco) {
        discosService.Inserir(disco);
    }

    @PutMapping
    public DiscosDTO alterar(@RequestBody DiscosDTO disco) {
        return discosService.Alterar(disco);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        discosService.Excluir(id);
        return ResponseEntity.ok().build();
    }
}
