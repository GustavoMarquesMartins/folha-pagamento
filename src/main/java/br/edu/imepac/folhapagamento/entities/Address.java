package br.edu.imepac.folhapagamento.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

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

    public void updateAdress(Address address) {

        if (address.getCity() != null) {
            this.city = address.getCity();
        }

        if (address.getComplement() != null) {
            this.complement = address.getComplement();
        }

        if (address.getState() != null) {
            this.state = address.getState();
        }

        if (address.getNeighborhood() != null) {
            this.neighborhood = address.getNeighborhood();
        }

        if (address.getNumber() != null) {
            this.number = address.getNumber();
        }

        if (address.getZipCode() != null) {
            this.zipCode = address.getZipCode();
        }

        if (address.getPublicPlace() != null) {
            this.publicPlace = address.getPublicPlace();
        }
    }

}
