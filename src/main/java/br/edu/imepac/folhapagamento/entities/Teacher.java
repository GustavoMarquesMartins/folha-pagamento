package br.edu.imepac.folhapagamento.entities;

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

//    @OneToMany(targetEntity = AcademicSemesterTeacher.class)
//    private List<AcademicSemesterTeacher> academicSemesterTeachers;
}
