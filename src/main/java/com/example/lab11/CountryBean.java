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
    private String continent;
    private String region;
    // area z małej bo może nie mapować
    private Double surfaceArea;
    private Integer indeptYear;
    private Long population;
    private Double lifeExpectancy;
    private Double gnp;
    private Double gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

}
