package atv.carlos.main.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import atv.carlos.main.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
