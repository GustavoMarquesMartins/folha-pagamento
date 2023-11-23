package br.edu.imepac.folhapagamento.entities;

import br.edu.imepac.folhapagamento.domains.teacher.TeacherCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "teachers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher extends Employer {

    private Float valueHour;

    public void update(TeacherCreateRequest teacher) {
        if (teacher.getName() != null) {
            this.setName(teacher.getName());
        }
        if (teacher.getEmail() != null) {
            this.setEmail(teacher.getEmail());
        }
        if (teacher.getValueHour() != null) {
            this.setValueHour(teacher.getValueHour());
        }
        if (teacher.getAddress() != null) {
            this.getAddress().updateAdress(teacher.getAddress());
        }
    }

//    @OneToMany(targetEntity = AcademicSemesterTeacher.class)
//    private List<AcademicSemesterTeacher> academicSemesterTeachers;
}
