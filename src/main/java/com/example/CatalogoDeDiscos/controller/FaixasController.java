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

import com.example.CatalogoDeDiscos.dto.FaixasDTO;
import com.example.CatalogoDeDiscos.service.FaixasService;

@RestController
@RequestMapping(value = "/faixas")
@CrossOrigin
public class FaixasController {

    @Autowired
    private FaixasService faixasService;

    @GetMapping
    public List<FaixasDTO> listarTodos() {
        return faixasService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody FaixasDTO faixa) {
        faixasService.Inserir(faixa);
    }

    @PutMapping
    public FaixasDTO alterar(@RequestBody FaixasDTO faixa) {
        return faixasService.Alterar(faixa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        faixasService.Excluir(id);
        return ResponseEntity.ok().build();
    }
}
