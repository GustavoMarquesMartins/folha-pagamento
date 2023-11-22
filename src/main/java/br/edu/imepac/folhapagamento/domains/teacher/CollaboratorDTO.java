package br.edu.imepac.folhapagamento.domains.teacher;

import br.edu.imepac.folhapagamento.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollaboratorDTO {
    private Long id;
    private String name;
    private String email;
    private Address address;
    private Float valueHour;
}
