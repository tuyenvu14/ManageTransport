package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto implements Serializable {

    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cmt")
    private String cmt;

    @JsonProperty("license_code")
    private String licenseCode;

    @JsonProperty("license_type")
    private String licenseType;

    @JsonProperty("address")
    private String address;

    @JsonProperty("date_of_birth")
    private Date dateOfBirth;

    @JsonProperty("seniority")
    private int seniority;
}
