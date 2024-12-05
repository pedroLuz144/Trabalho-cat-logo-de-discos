package com.example.CatalogoDeDiscos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CatalogoDeDiscos.dto.DiscosDTO;
import com.example.CatalogoDeDiscos.entity.DiscosEntity;
import com.example.CatalogoDeDiscos.repository.DiscosRepository;

@Service
public class DiscosService {

    @Autowired
    private DiscosRepository discosRepository;

    public List<DiscosDTO> listarTodos() {
        List<DiscosEntity> discos = discosRepository.findAll();
        return discos.stream().map(DiscosDTO::new).toList();
    }

    public void Inserir(DiscosDTO disco) {
        DiscosEntity discosEntity= new DiscosEntity(disco);
        discosRepository.save(discosEntity);
    } 

    public DiscosDTO Alterar(DiscosDTO disco) {
        DiscosEntity discosEntity = new DiscosEntity(disco);
        return new DiscosDTO(discosRepository.save(discosEntity));
    }

    public void Excluir (Long id) {
        DiscosEntity disco = discosRepository.findById(id).get();
        discosRepository.delete(disco);
    }
}
