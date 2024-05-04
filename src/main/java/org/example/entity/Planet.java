package org.example.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "coreTemperature")
@EqualsAndHashCode
public class Planet {
    private String name;
    private Double radius;
    private Double coreTemperature;

}
