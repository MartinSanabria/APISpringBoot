package com.example.Laboratorio.service;

import com.example.Laboratorio.repository.ConstructionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Service
@RequestMapping
public class ConstructionService {
    @Autowired
    private ConstructionRepository constructionRepository;
    public List<Map<String, Object>> getHighPopulationCountries() {
        return constructionRepository.getHighPopulationCountries();
    }

    public List<Map<String, Object>> getPopulationIncrease(){
        return constructionRepository.getPopulationIncrease();
    }

    public List<Map<String, Object>> getPopulationGrowth() {
        return constructionRepository.getPopulationGrowth();
    }

    public List<Map<String, Object>> getPopulationDecrease() {
        return constructionRepository.getPopulationDecrease();
    }

    public List<Map<String, Object>> getPopulationIncreaseGrowth() {
        return constructionRepository.getPopulationIncrease();
    }
}
