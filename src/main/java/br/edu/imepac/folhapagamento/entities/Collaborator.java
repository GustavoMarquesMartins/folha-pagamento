package br.edu.imepac.folhapagamento.entities;

import br.edu.imepac.folhapagamento.domains.teacher.CollaboratorCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "collaborators")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Collaborator extends Employer {

    private Float valueHour;

    public void update(CollaboratorCreateRequest collaborator) {
        if (collaborator.getName() != null) {
            this.setName(collaborator.getName());
        }
        if (collaborator.getEmail() != null) {
            this.setEmail(collaborator.getEmail());
        }
        if (collaborator.getValueHour() != null) {
            this.setValueHour(collaborator.getValueHour());
        }
        if (collaborator.getAddress() != null) {
            this.getAddress().updateAdress(collaborator.getAddress());
        }
    }

//    @OneToMany(targetEntity = AcademicSemesterTeacher.class)
//    private List<AcademicSemesterTeacher> academicSemesterTeachers;
}
