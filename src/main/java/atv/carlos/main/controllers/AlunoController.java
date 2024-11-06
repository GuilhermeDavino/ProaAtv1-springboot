package atv.carlos.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import atv.carlos.main.models.Aluno;
import atv.carlos.main.repositories.AlunoRepository;
import jakarta.transaction.Transactional;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@Transactional
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addAluno(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
        return ResponseEntity.ok("Aluno inserido com sucesso!");
    }

    @GetMapping("/list")
    public ResponseEntity<List<Aluno>> listAlunos() {
        List<Aluno> alunos = alunoRepository.findAll();
        return ResponseEntity.ok(alunos);
    }
}
