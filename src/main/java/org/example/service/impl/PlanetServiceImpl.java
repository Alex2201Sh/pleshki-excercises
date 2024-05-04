package org.example.service.impl;

import org.example.entity.Planet;
import org.example.repository.PlanetRepository;
import org.example.repository.impl.PlanetRepositoryFromList;
import org.example.service.PlanetService;

import java.util.List;

public class PlanetServiceImpl implements PlanetService {

    private PlanetRepository planetRepository = new PlanetRepositoryFromList();
//    private PlanetRepository planetRepository = new PlanetRepositoryFromDatabase();

    @Override
    public List<Planet> getAllPlanets() {
        return planetRepository.getAllPlanets();
    }

    @Override
    public Planet getPlanetByName(String name) {
        return planetRepository.getPlanetByName(name);
    }

    @Override
    public void savePlanet(Planet planet) {
        planetRepository.save(planet);
    }

    @Override
    public void updatePlanet(Planet planet) {
        planetRepository.update(planet);
    }

    @Override
    public Planet deletePlanetByName(String planetName) {
        return planetRepository.deletePlanetByName(planetName);
    }
}
