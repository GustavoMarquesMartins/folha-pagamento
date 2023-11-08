package br.edu.imepac.folhapagamento.repositories;

import br.edu.imepac.folhapagamento.entities.CourseManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseManagerRepositories extends JpaRepository<CourseManager, Long> {
}
