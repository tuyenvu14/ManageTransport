package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDto implements Serializable {

    private int id;

    @JsonProperty("license_plate")
    private String licensePlate;

    @JsonProperty("color")
    private String color;

    @JsonProperty("manufacturer")
    private String manufacturer;

    @JsonProperty("version")
    private String version;

    @JsonProperty("model")
    private String model;

    @JsonProperty("seats")
    private int seats;

    @JsonProperty("years_of_use")
    private int yearsOfUse;

    @JsonProperty("last_maintenance_date")
    private Instant lastMaintenanceDate;
}
