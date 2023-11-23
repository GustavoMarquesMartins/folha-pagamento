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

    public Address(Address address) {

        if (address.getCity() != null) {
            this.setCity(address.getCity());
        }

        if (address.getComplement() != null) {
            this.setComplement(address.getComplement());
        }

        if (address.getState() != null) {
            this.setState(address.getState());
        }

        if (address.getNeighborhood() != null) {
            this.setNeighborhood(address.getNeighborhood());
        }
        if (address.getNumber() != null) {
            this.setNumber(address.getNumber());
        }

        if (address.getZipCode() != null) {
            this.setZipCode(address.getZipCode());
        }

        if (address.getPublicPlace() != null) {
            this.setCity(address.getPublicPlace());
        }

    }
}
