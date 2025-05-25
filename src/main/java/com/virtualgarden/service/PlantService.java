package com.virtualgarden.service;

import com.virtualgarden.model.Plant;
import com.virtualgarden.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantService {

    @Autowired
    private PlantRepository plantRepository;

    public Plant getPlantById(Long id) {
        return plantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Plant not found with id: " + id));
    }

    public void updateWater(Long id, double water) {
        Plant plant = getPlantById(id);
        plant.setWater(water);
        plantRepository.save(plant);
    }

    public void updateLight(Long id, double light) {
        Plant plant = getPlantById(id);
        plant.setLight(light);
        plantRepository.save(plant);
    }

    public void updateFertilizer(Long id, double fertilizer) {
        Plant plant = getPlantById(id);
        plant.setFertilizer(fertilizer);
        plantRepository.save(plant);
    }

    public void updateHealth(Long id, double health) {
        Plant plant = getPlantById(id);
        plant.setHealth(health);
        plantRepository.save(plant);
    }

    public void updateLSystem(Long id, String lsystem) {
        Plant plant = getPlantById(id);
        plant.setLsystem(lsystem);
        plantRepository.save(plant);
    }

    public void updateSpecies(Long id, String species) {
        Plant plant = getPlantById(id);
        plant.setSpecies(species);
        plantRepository.save(plant);
    }

}
