package AvaliacaoFormativaMarco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AvaliacaoFormativaMarco.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
