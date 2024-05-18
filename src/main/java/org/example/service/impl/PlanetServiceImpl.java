package org.example.service.impl;

import org.example.entity.Planet;
import org.example.repository.PlanetJPARepository;
import org.example.repository.PlanetRepository;
import org.example.repository.impl.PlanetRepositoryJDBCImpl;
import org.example.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetServiceImpl implements PlanetService {
//    @Autowired
//    private PlanetJPARepository planetRepository;

    private PlanetRepository planetRepository = new PlanetRepositoryJDBCImpl();

    @Override
    public List<Planet> getPlanetList() {
        return planetRepository.findAll();
    }

//    @Override
//    public Planet getPlanetByName(String name) {
//        return planetRepository.getPlanetByName(name);
//    }
//    @Override
//    public void savePlanet(Planet planet) {
//        planetRepository.save(planet);
//    }
//
//    @Override
//    public void updatePlanet(Planet planet) {
//        planetRepository.update(planet);
//    }
//
//    @Override
//    public Planet deletePlanetByName(String planetName) {
//        return planetRepository.deletePlanetByName(planetName);
//    }
}


