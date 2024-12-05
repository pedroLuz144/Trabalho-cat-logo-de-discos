package com.example.CatalogoDeDiscos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CatalogoDeDiscos.dto.FaixasDTO;
import com.example.CatalogoDeDiscos.entity.FaixasEntity;
import com.example.CatalogoDeDiscos.repository.FaixasRepository;

@Service
public class FaixasService {

    @Autowired
    private FaixasRepository faixasRepository;

    public List<FaixasDTO> listarTodos() {
        List<FaixasEntity> faixas = faixasRepository.findAll();
        return faixas.stream().map(FaixasDTO::new).toList();
    }

    public void Inserir(FaixasDTO faixa) {
        FaixasEntity faixasEntity = new FaixasEntity(faixa);
        faixasRepository.save(faixasEntity);
    }

    public FaixasDTO Alterar(FaixasDTO faixa) {
        FaixasEntity faixasEntity = new FaixasEntity(faixa);
        return new FaixasDTO(faixasRepository.save(faixasEntity));
    }

    public void Excluir(Long id) {
        FaixasEntity faixa = faixasRepository.findById(id).get();
        faixasRepository.delete(faixa);
    }
}
