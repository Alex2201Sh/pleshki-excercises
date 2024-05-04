package org.example.repository.impl;

import org.example.entity.Planet;
import org.example.repository.PlanetRepository;

import java.util.ArrayList;
import java.util.List;

public class PlanetRepositoryFromList implements PlanetRepository {

    private List<Planet> planetList;

    public PlanetRepositoryFromList() {
        planetList = new ArrayList<>();
        planetList.add(new Planet("Mars", 1245D, 300D));
        planetList.add(new Planet("Saturn", 1245D, -300D));
        planetList.add(new Planet("Jupiter", 1245D, -1300D));
        planetList.add(new Planet("Neptune", 1245D, -2300D));
        planetList.add(new Planet("Mars", 1245D, 300D));
        planetList.add(new Planet("Mercury", 1245D, 500D));
        planetList.add(new Planet("Earth", 6000D, 5000D));
        planetList.add(new Planet("Mars", 1245D, 300D));
    }

    @Override
    public List<Planet> getAllPlanets() {
        return planetList;
    }

    @Override
    public Planet getPlanetByName(String name) {
        return planetList
                .stream()
                .filter(planet -> name.equals(planet.getName()))
                .findFirst()
                .get();
    }

    @Override
    public void save(Planet planet) {
        planetList.add(planet);
    }

    @Override
    public void update(Planet planet) {
        //"Mars", 1245D, 300D
        Planet planetFromRepository = getPlanetByName(planet.getName());
        planetFromRepository.setRadius(planet.getRadius());
        planetFromRepository.setCoreTemperature(planet.getCoreTemperature());
    }

    @Override
    public Planet deletePlanetByName(String planetName) {
        Planet planetByName = getPlanetByName(planetName);
        planetList.remove(planetByName);
        return planetByName;
    }
}
