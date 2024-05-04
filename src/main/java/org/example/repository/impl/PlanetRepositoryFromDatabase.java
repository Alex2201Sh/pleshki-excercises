package org.example.repository.impl;

import org.example.entity.Planet;
import org.example.repository.PlanetRepository;

import java.util.List;

public class PlanetRepositoryFromDatabase implements PlanetRepository {
    @Override
    public List<Planet> getAllPlanets() {
        //сходим в БД и скачаем данные
        return List.of(                );
    }

    @Override
    public Planet getPlanetByName(String name) {
        return null;
    }

    @Override
    public void save(Planet planet) {

    }

    @Override
    public void update(Planet planet) {

    }

    @Override
    public Planet deletePlanetByName(String planetName) {
        return null;
    }
}
