package br.edu.imepac.folhapagamento.repositories;

import br.edu.imepac.folhapagamento.entities.Collaborator;
import br.edu.imepac.folhapagamento.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaboratorRepository extends JpaRepository<Collaborator, Long> {
}
