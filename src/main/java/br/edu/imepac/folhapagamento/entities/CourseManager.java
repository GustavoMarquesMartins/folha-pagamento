package br.edu.imepac.folhapagamento.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity(name = "course_managers")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class CourseManager extends Employer {
    private Float percentsStudent;
    private Float valuePayments;
    private Integer amountStudents;
}
