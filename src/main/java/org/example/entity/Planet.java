package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Planet {
    @Id
    private String name;
    private int temperature;
    private double diameter;

    public Planet() {
    }

    public Planet(String name, int temperature, double diameter) {
        this.name = name;
        this.temperature = temperature;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", diameter=" + diameter +
                '}';
    }
}
