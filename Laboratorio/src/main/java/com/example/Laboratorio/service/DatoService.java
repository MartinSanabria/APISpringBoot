package com.example.Laboratorio.service;

import com.example.Laboratorio.entities.Dato;
import com.example.Laboratorio.repository.DatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatoService {
    @Autowired
    DatoRepository datoRepository;

    public List<Object[]> HighPopulationCountry() {
        return  datoRepository.HighPopulationCountry();
    }

    public List<Object[]> IncreasePopulation(){
        return datoRepository.IncreasePopulation();
    }
}
