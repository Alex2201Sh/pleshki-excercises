package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Satellite {
    @Id
    private String satelliteName;
    private int satelliteTemperature;
    private double satelliteDiameter;
    @ManyToOne
    @JoinColumn(name = "name")
    private Planet planet;
}

