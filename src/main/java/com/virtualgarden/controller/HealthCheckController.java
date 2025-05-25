package com.virtualgarden.controller;

import com.virtualgarden.model.Plant;
import com.virtualgarden.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/plant")
public class HealthCheckController {

    @Autowired
    private PlantService plantService;

    @GetMapping("/{id}")
    public ResponseEntity<Plant> getPlant(@PathVariable Long id) {
        Plant plant = plantService.getPlantById(id);
        return ResponseEntity.ok(plant);
    }

    @GetMapping("/{id}/water")
    public ResponseEntity<Double> getWater(@PathVariable Long id) {
        double water = plantService.getPlantById(id).getWater();
        return ResponseEntity.ok(water);
    }

    @GetMapping("/{id}/light")
    public ResponseEntity<Double> getLight(@PathVariable Long id) {
        double light = plantService.getPlantById(id).getLight();
        return ResponseEntity.ok(light);
    }

    @GetMapping("/{id}/fertilizer")
    public ResponseEntity<Double> getFertilizer(@PathVariable Long id) {
        double fertilizer = plantService.getPlantById(id).getFertilizer();
        return ResponseEntity.ok(fertilizer);
    }

    @GetMapping("/{id}/health")
    public ResponseEntity<Double> getHealth(@PathVariable Long id) {
        double health = plantService.getPlantById(id).getHealth();
        return ResponseEntity.ok(health);
    }

    @GetMapping("/{id}/lsystem")
    public ResponseEntity<String> getLSystem(@PathVariable Long id) {
        String lsystem = plantService.getPlantById(id).getLsystem();
        return ResponseEntity.ok(lsystem);
    }

    @GetMapping("/{id}/species")
    public ResponseEntity<String> getSpecies(@PathVariable Long id) {
        String species = plantService.getPlantById(id).getSpecies();
        return ResponseEntity.ok(species);
    }

    @PostMapping("/{id}/water")
    public ResponseEntity<?> updateWater(@PathVariable Long id, @RequestBody Double value) {
        plantService.updateWater(id, value);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/light")
    public ResponseEntity<?> updateLight(@PathVariable Long id, @RequestBody Double value) {
        plantService.updateLight(id, value);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/fertilizer")
    public ResponseEntity<?> updateFertilizer(@PathVariable Long id, @RequestBody Double value) {
        plantService.updateFertilizer(id, value);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/health")
    public ResponseEntity<?> updateHealth(@PathVariable Long id, @RequestBody Double value) {
        plantService.updateHealth(id, value);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/lsystem")
    public ResponseEntity<?> updateLSystem(@PathVariable Long id, @RequestBody String value) {
        plantService.updateLSystem(id, value);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/species")
    public ResponseEntity<?> updateSpecies(@PathVariable Long id, @RequestBody String value) {
        plantService.updateSpecies(id, value);
        return ResponseEntity.ok().build();
    }

}
