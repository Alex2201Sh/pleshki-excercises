package org.example.service;

import org.example.entity.Planet;
import org.example.repository.PlanetJPARepository;
import org.example.repository.PlanetRepository;
import org.example.repository.impl.PlanetRepositoryJDBCImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetService {
//    @Autowired
//    private PlanetJPARepository planetRepository;

    private PlanetRepository planetRepository = new PlanetRepositoryJDBCImpl();

    public List<Planet> getPlanetList() {
        return planetRepository.findAll();
    }

}
