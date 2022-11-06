package com.example.lab11;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryBean implements Serializable {

    private String code;
    private String name;
    private long population;
    private long surfaceArea;

}
