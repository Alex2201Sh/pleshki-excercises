package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Planet {
    @Id
    private String name;
    private int temperature;
    private double diameter;
    @OneToMany(mappedBy = "planet")
    @JsonIgnore
    private List<Satellite> satellites;
}




