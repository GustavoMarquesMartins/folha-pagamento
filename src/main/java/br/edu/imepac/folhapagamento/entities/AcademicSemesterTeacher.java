package br.edu.imepac.folhapagamento.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "academic_semester_teachers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AcademicSemesterTeacher extends AcademicSemester {
    private Integer numberOfClassesMonth;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
