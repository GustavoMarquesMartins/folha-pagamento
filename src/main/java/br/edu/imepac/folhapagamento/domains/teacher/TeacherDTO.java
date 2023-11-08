package br.edu.imepac.folhapagamento.domains.teacher;

import br.edu.imepac.folhapagamento.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {
    private Long id;
    private String name;
    private String email;
    private Address address;
    private Float valueHour;
}
