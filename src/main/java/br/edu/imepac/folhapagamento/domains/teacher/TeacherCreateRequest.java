package br.edu.imepac.folhapagamento.domains.teacher;

import br.edu.imepac.folhapagamento.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherCreateRequest {
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    private Address address;
    @NotNull
    private Float valueHour;
}
