package org.example.repository;

import org.example.entity.Planet;

import java.util.List;

public interface PlanetRepository {
    List<Planet> getAllPlanets();
    Planet getPlanetByName(String name);
    void save(Planet planet);

    void update(Planet planet);

    Planet deletePlanetByName(String planetName);


}
