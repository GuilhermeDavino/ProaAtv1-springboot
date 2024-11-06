package atv.carlos.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import atv.carlos.main.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
