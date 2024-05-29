package com.example.Laboratorio.controller;

import com.example.Laboratorio.entities.Dato;
import com.example.Laboratorio.service.ConstructionService;
import com.example.Laboratorio.service.DatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/Datos")
public class DatoController {

    @Autowired
    private ConstructionService constructionService;
    @GetMapping("/")
    public List<Map<String, Object>> getHighPopulationCountries(){
        return constructionService.getHighPopulationCountries();
    }

    @GetMapping("/increase")
    public List<Map<String, Object>> getPopulationIncrease(){
        return constructionService.getPopulationIncrease();
    }

    @GetMapping("/increaseCountry")
    public List<Map<String, Object>> getPopulationGrowth(){
        return constructionService.getPopulationGrowth();
    }

    @GetMapping("/populationDecrease")
    public List<Map<String, Object>> getPopulationDecrease() {
        return constructionService.getPopulationDecrease();
    }

    @GetMapping("/populationIncrease")
    public List<Map<String, Object>> getPopulationIncreaseGrowth() {
        return constructionService.getPopulationIncreaseGrowth();
    }

}
