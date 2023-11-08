package br.edu.imepac.folhapagamento.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    private String publicPlace;
    private String complement;
    private String neighborhood;
    private String city;
    private String number;
    private String state;
    private String zipCode;
}
